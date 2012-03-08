/**
 * Alipay.com Inc.
 * Copyright (c) 2004-${nowYear} All Rights Reserved.
 */
package ${servicePackage}.impl;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import ${dataObjectPackage}.${dataObject};
import ${daoPackage}.${dataDao};
import ${servicePackage}.${service};

/**
 * 
 * @author ${author}
 * @version $Id: ${service}Impl.java, v 0.1 ${nowDayTime} ${author} Exp $
 */

public class ${service}Impl  extends SqlMapClientDaoSupport implements ${service}{
	private ${dataDao} ${dataDao?uncap_first};
	
	public void set${dataDao}(${dataDao} ${dataDao?uncap_first}) {
	    this.${dataDao?uncap_first} = ${dataDao?uncap_first};
	}
	
	public ${service}Impl() {
	    System.out.println("${service} test");
	}
	/**
	 * 添加一个${dataObject}
	 * @param  ${dataObject}  
	 * @return boolean  
	 * @throws DataAccessException
	 */
	public boolean insert(${dataObject} ${dataObject?uncap_first}) throws DataAccessException{
		return this.${dataDao?uncap_first}.insert(${dataObject?uncap_first});
	}
	/**
	 * 根据${dataObject?uncap_first}Id更新一条记录信息
	 * @param  ${dataObject}
	 * @return boolean  
	 * @throws DataAccessException
	 */
	public boolean update(${dataObject} ${dataObject?uncap_first}) throws DataAccessException{
		return this.${dataDao?uncap_first}.update(${dataObject?uncap_first});
	}
	/**
	 * 查询出所有的${dataObject}信息
	 * @return List
	 * @throws DataAccessException
	 */
	public List<${dataObject}> selectAll${dataObject}() throws DataAccessException{
		return this.${dataDao?uncap_first}.selectAll${dataObject}();
	}
	/**
	 * 根据varyId查询出${dataObject}信息
	 * @param  ${dataObject?uncap_first}Id  
	 * @return ${dataObject}
	 * @throws DataAccessException
	 */
	public ${dataObject} select${dataObject}ById(int ${dataObject?uncap_first}Id) throws DataAccessException{
		return this.${dataDao?uncap_first}.select${dataObject}ById(${dataObject?uncap_first}Id);
	}
	/**
	 * 根据多个${dataObject?uncap_first}Id集合查询出${dataObject}信息
	 * @param  ${dataObject?uncap_first}Id  
	 * @return List
	 * @throws DataAccessException
	 */
	public List<${dataObject}> select${dataObject}ByIds(List<Integer> ${dataObject?uncap_first}Ids) throws DataAccessException{
		return this.${dataDao?uncap_first}.select${dataObject}ByIds(${dataObject?uncap_first}Ids);
	}
	/**
	 * 根据${dataObject?uncap_first}Id集合删除相应${dataObject}信息
	 * @param  ${dataObject?uncap_first}Id 
	 * @return boolean
	 * @throws DataAccessException
	 */
	public boolean del(List<Integer> ${dataObject?uncap_first}Ids) throws DataAccessException{
		return this.${dataDao?uncap_first}.del(${dataObject?uncap_first}Ids);
	}
}