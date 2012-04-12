package com.std.tools.gen.data.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.std.tools.common.PropertiesUtils;
import com.std.tools.gen.data.AbstractTemplateData;
import com.std.utils.CommonUtils;

public class SimpleTemplateData extends AbstractTemplateData {

	public static final String TABLE_COLS="table.cols";
	public static final String COLS_TYPE="cols.type";
	public static final String COLS_COMMENT="cols.comment";

	public static final String AUTHOR="author";

	public static final String DATA_OBJECT_NAME="data.object.name";
	public static final String DAO_NAME="dao.name";
	public static final String SERVICE_NAME="service.name";

	public static final String DATA_OBJECT_PACKAGE="data.object.package";
	public static final String DAO_PACKAGE="dao.package";
	public static final String SERVICE_PACKAGE="service.package";
   
	private PropertiesUtils propsUtil;

	private List <String> tableColList=new ArrayList<String>();
	private List <String> fieldNameLst=new ArrayList<String>();
	private Map <String,String> colFieldMap=new HashMap<String,String>();
	private Map <String,String> fieldColMap=new HashMap<String,String>();
	private Map <String,String> fieldTypeMap=new HashMap<String,String>();
	private Map<String, String> fieldCommentMap = new HashMap<String,String>();

	public SimpleTemplateData(String configProps) throws IOException{
		if(configProps==null || configProps.equals("")) throw new RuntimeException("参数不能为空");
        this.propsUtil=PropertiesUtils.initProps(configProps);
        String tableCols=this.propsUtil.getValue(TABLE_COLS);
        String nameArray[]=tableCols.split(",");
        for (int i = 0; i < nameArray.length; i++) {
            this.fieldNameLst.add(CommonUtils.fromUnderscoreToCamel(nameArray[i].toLowerCase()));
        }
        for (int i = 0; i < nameArray.length; i++) {
        	this.tableColList.add(nameArray[i]);
        }
        for (int i = 0; i < nameArray.length; i++) {
        	this.colFieldMap.put(nameArray[i],fieldNameLst.get(i));
        }
        for (int i = 0; i < nameArray.length; i++) {
        	this.fieldColMap.put(fieldNameLst.get(i),nameArray[i]);
        }
    	String colsTypeStr=this.propsUtil.getValue(COLS_TYPE);
		String colTypeArray[] =colsTypeStr.split(",");
		for (int i = 0; i < nameArray.length; i++) {
		    fieldTypeMap.put(fieldNameLst.get(i), colTypeArray[i]);
		}
		
        String colsCommentStr=this.propsUtil.getValue(COLS_COMMENT);
        if(colsCommentStr!=null && !colsCommentStr.equals("")){
            String colsCommentArray[] =colsCommentStr.split(",");
            for (int i = 0; i < nameArray.length; i++) {
                fieldCommentMap.put(fieldNameLst.get(i), colsCommentArray[i]);
            }
        }
	}


	public String getServicePackage() {
		return this.propsUtil.getValue(SERVICE_PACKAGE);
	}

	public String getDataObjectPackage() {
		return this.propsUtil.getValue(DATA_OBJECT_PACKAGE);
	}

	public String getDAOPackage() {
		return this.propsUtil.getValue(DAO_PACKAGE);
	}

	public String getAuthor() {
		return this.propsUtil.getValue(AUTHOR);
	}

	public String getDataObjectName() {
		return this.propsUtil.getValue(DATA_OBJECT_NAME);
	}

	public String getDAOName() {
		return this.propsUtil.getValue(DAO_NAME);
	}

	public String getServiceName() {
		return this.propsUtil.getValue(SERVICE_NAME);
	}

	public List<String> getTableColsNameList() {
		return this.tableColList;
	}

	public List<String> getFieldsNameList() {
		return this.fieldNameLst;
	}

	public Map<String, String> getColFieldMap() {
		return this.colFieldMap;
	}

	public Map<String, String> getFieldColMap() {
		return this.fieldColMap;
	}

	public Map<String, String> getFieldTypeMap() {
		return this.fieldTypeMap;
	}

    public Map<String, String> getFieldCommentMap() {
        return this.fieldCommentMap;
    }

}
