##DaoImpl
	/** 求总数 */
	public int getVaryObjectTotal()throws DataAccessException{
	    return this.getObjectTotal("VaryObject.getAllVaryObject");
	}
	
	/** 取指定页数据  offSet 是启始行基数  count是取的行的数量，例如每页20行，取第3页，就是offset=20*(3-1) count=20/
	@SuppressWarnings("unchecked")
    public List<VaryObject> getVaryObjectList()throws DataAccessException{
	    return getSqlMapClientTemplate().queryForList("VaryObject.getAllVaryObject", offSet, count);
	}
	
## Spring中重要配置项
	<bean id="sqlExecutor" class="org.apache.ibatis.ext.executor.XSqlExecutor">
		<property name="dialect">
			<!-- sqlserver2005 -->
			<!-- <bean class="com.alipay.common.dialect.impl.SQLServer2005Dialect"/> -->
			<!-- mysql -->
			<!-- <bean class="com.alipay.common.dialect.impl.MySQLDialect" /> -->
			<!--oracle -->
			<bean class="org.apache.ibatis.ext.dialect.impl.OracleDialect" />
		</property>
		<property name="enableLimit">
			<value>true</value>
		</property>
	</bean>

	<bean id="baseDao" abstract="true" class="com.alipay.etl2.dao.impl.BaseDao" init-method="initialize">
		<property name="dataSource">
			<ref bean="oracleDataSource" />
		</property>
		<property name="sqlMapClient">
			<ref bean="sqlMapClient" />
		</property>
		<property name="sqlExecutor">
			<ref bean="sqlExecutor" />
		</property>
	</bean>		
##DAO的spring配置 ，注意parent属性保证初始化baseDao
<bean id="varyDAO" class="com.alipay.dss.datasharing.dal.varmanager.impl.VaryDAOImpl" parent="baseDao"/>	