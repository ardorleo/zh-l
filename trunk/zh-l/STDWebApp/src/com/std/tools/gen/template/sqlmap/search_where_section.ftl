<dynamic prepend="where">
<#list nameList as fieldName>
	<isNotEmpty prepend="and" property="${fieldName}">${fieldName} like '%${"$"}${fieldName}${"$"}%'</isNotEmpty>
</#list>
</dynamic>