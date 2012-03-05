package com.std.tools.gen;

import java.io.IOException;

import com.std.tools.gen.data.impl.SimpleTemplateData;

import freemarker.template.TemplateException;

public class DataShare2Gen {
	protected static final String PATH_TEMPLATE="com/std/tools/gen/template";
	public static void main(String [] args) throws IOException, TemplateException{
		GeneralGen testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryValue.properties"));
		testGen.systemOutAll();
	}
}
