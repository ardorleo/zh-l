package org.apache.ibatis.ext.dialect.impl;

import org.apache.ibatis.ext.dialect.Dialect;

public class SQLServer2005Dialect implements Dialect {

	protected static final String SQL_END_DELIMITER = ";";
	private ThreadLocal<Boolean> supportsVariableLimit = new ThreadLocal<Boolean>();

	public SQLServer2005Dialect() {
		super();
		setSupportsVariableLimit(false);
	}

	private void setSupportsVariableLimit(boolean first) {
		supportsVariableLimit.set(first);
	}

	public String getLimitString(String sql, boolean hasOffset, int offset,
			int limit) {
		int orderByIndex = sql.toLowerCase().lastIndexOf("order by");
		if (orderByIndex <= 0) {
			// throw new UnsupportedOperationException(
			// "must specify 'order by' statement to support limit operation with offset in sql server 2005"
			// );
			sql = sql + "ORDER BY CURRENT_TIMESTAMP";
			orderByIndex = sql.toLowerCase().lastIndexOf("order by");
		}
		int begin = offset;
		int end = offset + limit;
		String sqlOrderBy = sql.substring(orderByIndex + 8);
		String sqlRemoveOrderBy = sql.substring(0, orderByIndex);
		int insertPoint = getSqlAfterSelectInsertPoint(sql);
		return new StringBuffer(sql.length() + 100)
				.append("with tempPagination as(")
				.append(sqlRemoveOrderBy)
				.insert(insertPoint + 23,
						" ROW_NUMBER() OVER(ORDER BY " + sqlOrderBy
								+ ") as RowNumber,")
				.append(") select * from tempPagination where RowNumber between "
						+ begin + " and " + end).toString();
	}

	public String getLimitString(String sql, int offset, int limit) {
		setSupportsVariableLimit(offset > 0);
		if (offset == 0) {
			return new StringBuffer(sql.length() + 8).append(sql)
					.insert(getSqlAfterSelectInsertPoint(sql), " top " + limit)
					.toString();
		}
		return getLimitString(sql, offset > 0, offset, limit);
	}

	public boolean supportsLimit() {
		return true;
	}

	protected static int getSqlAfterSelectInsertPoint(String sql) {
		int selectIndex = sql.toLowerCase().indexOf("select");
		final int selectDistinctIndex = sql.toLowerCase().indexOf(
				"select distinct");
		return selectIndex + (selectDistinctIndex == selectIndex ? 15 : 6);
	}
}
