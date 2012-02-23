<dynamic prepend="where">
	<isNotEmpty prepend="and" property="${field}">name like '%${"$"}name${"$"}%'</isNotEmpty>
</dynamic>