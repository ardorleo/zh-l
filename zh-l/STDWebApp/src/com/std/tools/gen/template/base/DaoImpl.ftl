/**
 * Alipay.com Inc.
 * Copyright (c) 2004-${nowYear} All Rights Reserved.
 */
package ${daoPackage}.impl;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import ${dataObjectPackage}.${dataObject};
import ${daoPackage}.${dataDao};

/**
 * 
 * @author ${author}
 * @version $Id: ${dataDao}Impl.java, v 0.1 ${nowDayTime} ${author} Exp $
 */
 
public class ${dataDao}Impl  extends SqlMapClientDaoSupport implements ${dataDao}{
	
	/**
	 * 添加一个${dataObject}
	 * @param  ${dataObject}  
	 * @return boolean  
	 * @throws DataAccessException
	 */
	public boolean insert(${dataObject} ${dataObject?uncap_first}) throws DataAccessException{
		try{
			this.getSqlMapClientTemplate().insert("${dataObject}.insert", ${dataObject?uncap_first});
			return true;
		} catch (DataAccessException ex) {
	        logger.error("添加新的${dataObject}时出错", ex);
	        throw ex;
		}
	}
	/**
	 * 根据${dataObject?uncap_first}Id更新一条记录信息
	 * @param  ${dataObject}
	 * @return boolean  
	 * @throws DataAccessException
	 */
	public boolean update(${dataObject} ${dataObject?uncap_first}) throws DataAccessException{
		try{
			this.getSqlMapClientTemplate().update("${dataObject}.update", ${dataObject?uncap_first});
			return true;
		} catch (DataAccessException ex) {
	        logger.error("更新${dataObject}时出错", ex);
	        throw ex;
		}
	}
	/**
	 * 查询出所有的${dataObject}信息
	 * @return List
	 * @throws DataAccessException
	 */
	@SuppressWarnings("unchecked")
	public List<${dataObject}> selectAll${dataObject}() throws DataAccessException{
	    try {
	        return this.getSqlMapClientTemplate().queryForList("${dataObject}.selectAll${dataObject}");
	    } catch (DataAccessException ex) {
	        logger.error("获取所有${dataObject}时出错", ex);
	        throw ex;
	    }
	}
	/**
	 * 根据varyId查询出${dataObject}信息
	 * @param  ${dataObject?uncap_first}Id  
	 * @return ${dataObject}
	 * @throws DataAccessException
	 */
	public ${dataObject} select${dataObject}ById(int ${dataObject?uncap_first}Id) throws DataAccessException{
	    try {
	        return (${dataObject}) this.getSqlMapClientTemplate()
	        .queryForObject("${dataObject}.select${dataObject}ById", ${dataObject?uncap_first}Id);
	    } catch (DataAccessException ex) {
	        logger.error("获取${dataObject}时出错", ex);
	        throw ex;
	    }
	}
	/**
	 * 根据多个${dataObject?uncap_first}Id集合查询出${dataObject}信息
	 * @param  ${dataObject?uncap_first}Id  
	 * @return List
	 * @throws DataAccessException
	 */
	@SuppressWarnings("unchecked")
	public List<${dataObject}> select${dataObject}ByIds(List<Integer> ${dataObject?uncap_first}Ids) throws DataAccessException{
	    try {
	        return this.getSqlMapClientTemplate().queryForList("${dataObject}.select${dataObject}ByIds", ${dataObject?uncap_first}Ids);
	    } catch (DataAccessException ex) {
	        logger.error("获取部分${dataObject}时出错", ex);
	        throw ex;
	    }
	}
	/**
	 * 根据${dataObject?uncap_first}Id集合删除相应${dataObject}信息
	 * @param  ${dataObject?uncap_first}Id 
	 * @return boolean
	 * @throws DataAccessException
	 */
	public boolean del(List<Integer> ${dataObject?uncap_first}Ids) throws DataAccessException{
		try{
			this.getSqlMapClientTemplate().delete("${dataObject}.del", ${dataObject?uncap_first}Ids);
			return true;
		} catch (DataAccessException ex) {
	        logger.error("删除${dataObject}时出错", ex);
	        throw ex;
		}
	}
}