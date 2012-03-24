package org.apache.ibatis.ext.statement;

import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.mapping.statement.SelectStatement;

public class CountStatementUtil {
	public static MappedStatement createTotalStatement(MappedStatement selectStatement) {
		return new CountStatement((SelectStatement) selectStatement);
	}

	public static String getTotalStatementId(String selectStatementId) {
		return "__" + selectStatementId + "Count__";
	}

}

