/**
 * Alipay.com Inc.
 * Copyright (c) 2004-${nowYear} All Rights Reserved.
 */
package ${dataObjectPackage};
import java.io.Serializable;

/**
 *
 * @author ${author}
 * @version $Id: ${dataObject}.java, v 0.1 ${nowDayTime} ${author} Exp $
 */

public class ${dataObject} implements Serializable {
	private static final long serialVersionUID = 1L;
<#list fieldsNameList as fieldName>
	<#list fieldTypeMap?keys as keyName>
		<#if keyName==fieldName>
	/** ${fieldCommentMap[fieldName]} */
	private ${fieldTypeMap[keyName]} ${fieldName};
		</#if>
	</#list>
</#list>
<#list fieldsNameList as fieldName>
	<#list fieldTypeMap?keys as keyName>
		<#if keyName==fieldName>
	/**
	 * 设置  ${fieldCommentMap[fieldName]} 的值
	 * @return
	 */
	public void set${fieldName?cap_first}(${fieldTypeMap[keyName]} ${fieldName}){
	  this.${fieldName} = ${fieldName};
	}
	/**
	 * 返回  ${fieldCommentMap[fieldName]} 的值
	 * @return
	 */
	public ${fieldTypeMap[keyName]} get${fieldName?cap_first}(){
	  return ${fieldName};
	}
		</#if>
	</#list>
</#list>
}