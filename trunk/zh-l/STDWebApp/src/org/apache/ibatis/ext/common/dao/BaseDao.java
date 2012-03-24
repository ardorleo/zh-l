package org.apache.ibatis.ext.common.dao;

import org.apache.ibatis.ext.common.ReflectUtil;
import org.apache.ibatis.ext.statement.CountStatementUtil;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;
import com.ibatis.sqlmap.engine.execution.SqlExecutor;
import com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient;
import com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;

public  class BaseDao extends SqlMapClientDaoSupport implements IBaseDao {
    private SqlExecutor  sqlExecutor;

    public SqlExecutor getSqlExecutor() {
        return sqlExecutor;
    }

    public void setSqlExecutor(SqlExecutor sqlExecutor) {
        this.sqlExecutor = sqlExecutor;
    }
    
    @SuppressWarnings("deprecation")
    public void initialize() throws Exception {
        if (sqlExecutor != null) {
            SqlMapClient sqlMapClient = getSqlMapClientTemplate().getSqlMapClient();
            if (sqlMapClient instanceof ExtendedSqlMapClient) {
                ReflectUtil.setFieldValue(((ExtendedSqlMapClient) sqlMapClient).getDelegate(), "sqlExecutor", SqlExecutor.class,
                        sqlExecutor);
            }
        }
    }

    public int getObjectTotal(String selectQuery, Object parameterObject) {
        prepareCountQuery(selectQuery);
        return Integer.parseInt(getSqlMapClientTemplate().queryForObject(
            CountStatementUtil.getTotalStatementId(selectQuery), parameterObject).toString());
    }

    public int getObjectTotal(String selectQuery) {
        prepareCountQuery(selectQuery);
        String totalSqlId = CountStatementUtil.getTotalStatementId(selectQuery);
        String resultTotalStr = getSqlMapClientTemplate().queryForObject(totalSqlId).toString();
        return Integer.parseInt(resultTotalStr);
    }

    protected void prepareCountQuery(String selectQuery) {
        String countQuery = CountStatementUtil.getTotalStatementId(selectQuery);
        if (logger.isDebugEnabled()) {
            logger.debug("Convert " + selectQuery + " to " + countQuery);
        }
        SqlMapClient sqlMapClient = getSqlMapClientTemplate().getSqlMapClient();
        if (sqlMapClient instanceof ExtendedSqlMapClient) {
            SqlMapExecutorDelegate delegate = ((ExtendedSqlMapClient) sqlMapClient).getDelegate();
            try {
                delegate.getMappedStatement(countQuery);
            } catch (SqlMapException e) {
                MappedStatement totalStatement = CountStatementUtil.createTotalStatement(delegate
                    .getMappedStatement(selectQuery));
                delegate.addMappedStatement(totalStatement);
            }

        }
    }

}
