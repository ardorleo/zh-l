/**
 * Alipay.com Inc.
 * Copyright (c) 2004-${nowYear} All Rights Reserved.
 */
package ${daoPackage};

import java.util.List;
import org.springframework.dao.DataAccessException;
import ${dataObjectPackage}.${dataObject};

/**
 * 
 * @author ${author}
 * @version $Id: ${dataDao}.java, v 0.1 ${nowDayTime} ${author} Exp $
 */
 
public interface ${dataDao}  {
	
/**
 * 添加一个${dataObject}
 * @param  ${dataObject}  
 * @return boolean  
 * @throws DataAccessException
 */
public boolean insert(${dataObject} ${dataObject?uncap_first}) throws DataAccessException;
/**
 * 根据${dataObject?uncap_first}Id更新一条记录信息
 * @param  ${dataObject}
 * @return boolean  
 * @throws DataAccessException
 */
public boolean update(${dataObject} ${dataObject?uncap_first}) throws DataAccessException;
/**
 * 查询出所有的${dataObject}信息
 * @return List
 * @throws DataAccessException
 */
public List<${dataObject}> selectAll${dataObject}() throws DataAccessException;
/**
 * 根据${dataObject?uncap_first}Id查询出${dataObject}信息
 * @param  ${dataObject?uncap_first}Id  
 * @return ${dataObject}
 * @throws DataAccessException
 */
public ${dataObject} select${dataObject}ById(int ${dataObject?uncap_first}Id) throws DataAccessException;
/**
 * 根据多个${dataObject?uncap_first}Id集合查询出${dataObject}信息
 * @param  ${dataObject?uncap_first}Id  
 * @return List
 * @throws DataAccessException
 */
public List<${dataObject}> select${dataObject}ByIds(List<Integer> ${dataObject?uncap_first}Ids) throws DataAccessException;
/**
 * 根据${dataObject?uncap_first}Id集合删除相应${dataObject}信息
 * @param  ${dataObject?uncap_first}Id 
 * @return boolean
 * @throws DataAccessException
 */
public boolean del(List<Integer> ${dataObject?uncap_first}Ids) throws DataAccessException;

}