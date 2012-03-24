<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE sqlMap PUBLIC "-//iBATIS.com//DTD SQL Map 2.0//EN" "http://www.ibatis.com/dtd/sql-map-2.dtd">
<sqlMap namespace="${dataObject}">

	<typeAlias alias="${dataObject?uncap_first}" type="${dataObjectPackage}.${dataObject}" />

	<resultMap id="${dataObject?uncap_first}ResultView"  class="${dataObject?uncap_first}">
	<#list fieldColMap?keys as field>
		<!-- ${fieldCommentMap[field]} -->
		<result property="${field}"	column="${fieldColMap[field]}"/>
	</#list>
	</resultMap>

	<!-- 添加${dataObject} -->
	<insert id="insert" parameterClass="${dataObject?uncap_first}">
		insert into ${toUnderscore(dataObject)?upper_case}
			(<#list tableColList as col>${col}<#if col_has_next>,</#if></#list>)
		values
			(<#list obFeildList as field>#${field}#<#if field_has_next>,</#if></#list>)
	</insert>

	<!-- 更新${dataObject} -->
	<update id="update" parameterClass="${dataObject?uncap_first}">
		UPDATE ${toUnderscore(dataObject)?upper_case} a
		SET
			<#list fieldColMap?keys as field>
			a.${fieldColMap[field]} = #${field}#<#if field_has_next>,</#if>
			</#list>
		WHERE
			a.id = #id#
	</update>

	<!--查找所有的${dataObject} -->
	<select id="selectAll${dataObject}" resultMap="${dataObject?uncap_first}ResultView">
		select
			<#list fieldColMap?keys as field>
			a.${fieldColMap[field]}<#if field_has_next>,</#if>
			</#list>
		  from ${toUnderscore(dataObject)?upper_case} A 
	</select>

	<!--查找部分的${dataObject} -->
	<select id="select${dataObject}ByIds" resultMap="${dataObject?uncap_first}ResultView" parameterClass="java.util.List">
		select
			<#list fieldColMap?keys as field>
			a.${fieldColMap[field]}<#if field_has_next>,</#if>
			</#list>
		from ${toUnderscore(dataObject)?upper_case} a
		where a.ID in
		<iterate conjunction="," open="(" close=")" >
			#value[]#
		</iterate>
	</select>

	<!--根据条件查找${dataObject} -->
	<select id="select${dataObject}ById" resultMap="${dataObject?uncap_first}ResultView" parameterClass="java.lang.Integer">
		select
			<#list fieldColMap?keys as field>
			a.${fieldColMap[field]}<#if field_has_next>,</#if>
			</#list>
		  from ${toUnderscore(dataObject)?upper_case} a
		  where a.ID = #value#
	</select>

	<!--删除${dataObject} -->
	<delete id="del" parameterClass="java.util.List">
		delete from
		     ${toUnderscore(dataObject)?upper_case}
		where
		   ID in
		   <iterate conjunction="," open="(" close=")" >
             #value[]#
           </iterate>
    </delete>

</sqlMap>