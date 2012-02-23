package com.std.tools.gen;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.std.tools.common.PropertiesUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Etl2Gen {
	protected static final String PATH_TEMPLATE="com/std/tools/gen/template";
	public static void main(String [] args) throws IOException, TemplateException{
		//genSearchWhereSection();
		//genExtCtrolGridHead();
		genExtLoadCtrolGridHead();
	}


	/**
	 * @throws IOException
	 * @throws TemplateException
	 */
	private static void genSearchWhereSection() throws IOException, TemplateException {
		List <String> nameList=new ArrayList<String>();
		PropertiesUtils pus=PropertiesUtils.initProps("com/std/tools/gen/profiles/Etl2Gen.properties");
		String nameListStr=pus.getValue("name.list");
		String nameArray[]=nameListStr.split(",");
		for (int i = 0; i < nameArray.length; i++) {
			nameList.add(nameArray[i]);
		}
		Map<String,Object>parametersMap=new HashMap<String,Object>();
		parametersMap.put("nameList",nameList);
		genResult(parametersMap,"sqlmap","search_where_section.ftl");
	}

	/**
	 * 生成抽取表格的头信息
	 *
	 * @throws IOException
	 * @throws TemplateException
	 */
	private static void genExtCtrolGridHead() throws IOException, TemplateException {
		List <String> nameList=new ArrayList<String>();
		PropertiesUtils pus=PropertiesUtils.initProps("com/std/tools/gen/profiles/Etl2Gen.properties");
		String nameListStr=pus.getValue("ext.main.field");
		String nameArray[]=nameListStr.split(",");
		for (int i = 0; i < nameArray.length; i++) {
			nameList.add(nameArray[i]);
		}
		Map<String,Object>parametersMap=new HashMap<String,Object>();
		parametersMap.put("nameList",nameList);
		genResult(parametersMap,"grid","ext.ftl");
	}
	/**
	 * 生成装载表格的头信息
	 *
	 * @throws IOException
	 * @throws TemplateException
	 */
	private static void genExtLoadCtrolGridHead() throws IOException, TemplateException {
		List <String> nameList=new ArrayList<String>();
		PropertiesUtils pus=PropertiesUtils.initProps("com/std/tools/gen/profiles/Etl2Gen.properties");
		String nameListStr=pus.getValue("ext.main.load.field");
		String nameArray[]=nameListStr.split(",");
		for (int i = 0; i < nameArray.length; i++) {
			nameList.add(nameArray[i]);
		}
		Map<String,Object>parametersMap=new HashMap<String,Object>();
		parametersMap.put("nameList",nameList);
		genResult(parametersMap,"grid","ext.ftl");
	}
	/**
	 * 由模板生成结果
	 *
	 * @param parametersMap  参数对象
	 * @param subPathAndName 子路径和模板文件
	 * @throws IOException
	 * @throws TemplateException
	 */
	protected static void genResult(Map parametersMap, String subPath, String fliename) throws IOException, TemplateException{
		Configuration cfg = new Configuration();
		if(subPath!=null&&!subPath.isEmpty()){
			cfg.setDirectoryForTemplateLoading(new File(Etl2Gen.class.getClassLoader().getResource(PATH_TEMPLATE+"/"+subPath).getFile()));
		}else{
			cfg.setDirectoryForTemplateLoading(new File(Etl2Gen.class.getClassLoader().getResource(PATH_TEMPLATE).getFile()));
		}
		Template template = cfg.getTemplate(fliename);
		Writer out = new OutputStreamWriter(System.out);
		template.process(parametersMap, out);
		out.flush();
	}
}
