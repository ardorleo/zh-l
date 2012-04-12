package com.std.tools.gen.data;

import java.util.HashMap;
import java.util.Map;

import com.std.utils.CommonUtils;

public abstract class AbstractTemplateData implements ITemplateData {

	public String getNowYear() {
		return CommonUtils.getNowYear();
	}

	public String getNowDayTime() {
		return CommonUtils.getNowDayTime();
	}

	@SuppressWarnings("deprecation")
	public Map<String, Object> getTemplateDataMap() {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(ITemplateData.SERVICE_PACKAGE, this.getServicePackage());
		dataMap.put(ITemplateData.DAO_PACKAGE, this.getDAOPackage());
		dataMap.put(ITemplateData.DATA_OBJECT_PACKAGE, this.getDataObjectPackage());
		dataMap.put(ITemplateData.AUTHOR, this.getAuthor());
		dataMap.put(ITemplateData.NOW_YEAR, this.getNowYear());
		dataMap.put(ITemplateData.NOW_DAY_TIME, this.getNowDayTime());
		dataMap.put(ITemplateData.SERVICE_NAME, this.getServiceName());
		dataMap.put(ITemplateData.DAO_NAME, this.getDAOName());
		dataMap.put(ITemplateData.DATA_OBJECT_NAME, this.getDataObjectName());
		dataMap.put(ITemplateData.TABLE_COLS_NAME_LIST,this.getTableColsNameList());
		dataMap.put(ITemplateData.FIELDS_NAME_LIST, this.getFieldsNameList());
		dataMap.put(ITemplateData.COL_FIELD_MAP, this.getColFieldMap());
		dataMap.put(ITemplateData.FIELD_COL_MAP, this.getFieldColMap());
		dataMap.put(ITemplateData.FIELD_TYPE_MAP, this.getFieldTypeMap());
		dataMap.put(ITemplateData.FIELD_COMMENT_MAP, this.getFieldCommentMap());

		dataMap.put(ITemplateData.DATA_OBJECT, this.getDataObjectName());
		dataMap.put(ITemplateData.DATA_DAO, this.getDAOName());
		dataMap.put(ITemplateData.SERVICE, this.getServiceName());
		dataMap.put(ITemplateData.TABLE_COL_LIST,this.getTableColsNameList());
		dataMap.put(ITemplateData.OB_FEILD_LIST, this.getFieldsNameList());
		return dataMap;
	}
}
