/**
 * Alipay.com Inc.
 * Copyright (c) 2004-${nowYear} All Rights Reserved.
 */
package ${package};
import java.io.Serializable;

/**
 * 
 * @author ${author}
 * @version $Id: ${dataObject}.java, v 0.1 ${nowDayTime} ${author} Exp $
 */
 
public class ${dataObject} implements Serializable {
	private static final long serialVersionUID = ;
<#list nameList as fieldName>
	<#list fieldTypeMap?keys as keyName>
		<#if keyName==fieldName>
	/**  */
	private ${fieldTypeMap[keyName]} ${fieldName};
		</#if>
	</#list>	
</#list>
<#list nameList as fieldName>
	<#list fieldTypeMap?keys as keyName>
		<#if keyName==fieldName>
	/**
	 * 设置${fieldName}的值
	 * @return
	 */
	public void set${fieldName?cap_first}(${fieldTypeMap[keyName]} ${fieldName}){
	  this.${fieldName} = ${fieldName};
	}	
	/**
	 * 返回${fieldName}的值
	 * @return
	 */
	public ${fieldTypeMap[keyName]} get${fieldName?cap_first}(){
	  return ${fieldName};
	}
		</#if>
	</#list>	
</#list>
}