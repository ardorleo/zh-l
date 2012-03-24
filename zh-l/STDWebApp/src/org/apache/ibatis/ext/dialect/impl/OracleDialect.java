/**
 *
 */
package org.apache.ibatis.ext.dialect.impl;

import org.apache.ibatis.ext.dialect.Dialect;


public class OracleDialect implements Dialect {
	protected static final String SQL_END_DELIMITER = ";";

	public String getLimitString(String sql, boolean hasOffset, int offset,
			int limit) {
		if (hasOffset) {
			offset = 0;
		}
		StringBuffer sb = new StringBuffer();
		sb.append("select * from ( select row_limit.*, rownum rownum_ from (");
		sb.append(this.trim(sql));
		sb.append(" ) row_limit where rownum <= ");
		sb.append(limit + offset);
		sb.append(" ) where rownum_ >");
		sb.append(offset);
		return sb.toString();
	}

	public String getLimitString(String sql, int offset, int limit) {
		return getLimitString(sql, offset == 1, offset, limit);
	}

	public boolean supportsLimit() {
		return true;
	}

	/**
	 * 去掉当前SQL 后分号
	 *
	 * @param sql
	 * @return
	 */
	private String trim(String sql) {
		sql = sql.trim();
		if (sql.endsWith(SQL_END_DELIMITER)) {
			sql = sql.substring(0,
					sql.length() - 1 - SQL_END_DELIMITER.length());
		}
		return sql;
	}
}
