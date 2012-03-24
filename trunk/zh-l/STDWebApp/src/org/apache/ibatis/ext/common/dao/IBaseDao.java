package org.apache.ibatis.ext.common.dao;

public interface IBaseDao {

	public int getObjectTotal(String selectQuery, Object parameterObject);

	public int getObjectTotal(String selectQuery);

}
