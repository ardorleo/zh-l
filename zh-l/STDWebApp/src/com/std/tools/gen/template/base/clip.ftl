<#-- Dao -->
public ${methodResultType} ${methodName}(${methodParameters},${dataObject}  ${dataObject?uncap_first}) throws DataAccessException;
<#-- DaoImpl -->
public ${methodResultType} ${methodName}(${methodParameters},${dataObject}  ${dataObject?uncap_first}) throws DataAccessException{
	try{
		this.getSqlMapClientTemplate().delete("${dataObject}.${methodName}", ${dataObject?uncap_first});
		return true;
	} catch (DataAccessException ex) {
	    logger.error("删除${dataObject}时出错", ex);
	    throw ex;
	}
}
<#-- Server -->
public ${methodResultType} ${methodName}(${methodParameters},${dataObject}  ${dataObject?uncap_first}) throws DataAccessException;
<#-- ServerImpl -->
public ${methodResultType} ${methodName}(${methodParameters},${dataObject}  ${dataObject?uncap_first}) throws DataAccessException{
	return this.${dataDao?uncap_first}.${methodName}(${dataObject?uncap_first});
}
<#-- SQLMap -->
<#-- 配置 -->