package com.std.tools.gen.data;

import java.util.List;
import java.util.Map;

public interface ITemplateData {

	public static final String SERVICE_PACKAGE = "servicePackage";
	public static final String DAO_PACKAGE = "daoPackage";
	public static final String DATA_OBJECT_PACKAGE = "dataObjectPackage";
	public static final String AUTHOR = "author";
	public static final String NOW_YEAR = "nowYear";
	public static final String NOW_DAY_TIME = "nowDayTime";
	public static final String SERVICE_NAME = "serviceName";
	public static final String DAO_NAME = "daoName";
	public static final String DATA_OBJECT_NAME = "dataObjectName";
	public static final String TABLE_COLS_NAME_LIST = "tableColsNameList";
	public static final String FIELDS_NAME_LIST = "fieldsNameList";
	public static final String COL_FIELD_MAP = "colFieldMap";
	public static final String FIELD_COL_MAP = "fieldColMap";
	public static final String FIELD_TYPE_MAP = "fieldTypeMap";
	public static final String FIELD_COMMENT_MAP = "fieldCommentMap";

	/** like FIELDS_NAME_LIST*/
	@Deprecated
	public static final String OB_FEILD_LIST = "obFeildList";
	/** like TABLE_COLS_NAME_LIST*/
	@Deprecated
	public static final String TABLE_COL_LIST = "tableColList";
	/** like DATA_OBJECT_NAME */
	@Deprecated
	public static final String DATA_OBJECT = "dataObject";
	/** like DAO_NAME*/
	@Deprecated
	public static final String DATA_DAO = "dataDao";
	/** like SERVICE_NAME*/
	@Deprecated
	public static final String SERVICE = "service";



	public String getServicePackage();

	public String getDataObjectPackage();

	public String getDAOPackage();

	public String getNowYear();

	public String getNowDayTime();

	public String getAuthor();

	public String getDataObjectName();

	public String getDAOName();

	public String getServiceName();

	public List<String> getTableColsNameList();

	public List<String> getFieldsNameList();

	public Map<String, String> getColFieldMap();

	public Map<String, String> getFieldColMap();

	public Map<String,String> getFieldTypeMap();
	
	public Map<String,String> getFieldCommentMap();

}
