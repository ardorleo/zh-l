package com.std.tools.gen;

import java.io.IOException;

import com.std.tools.gen.data.impl.SimpleTemplateData;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;

public class DataShare2Gen {
	public static void main(String [] args) throws IOException, TemplateException{
	    GeneralGen testGen=null;//必须初始化
	    
	    /*VaryValue*/
//		testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryValue.properties"));
		/*VaryObject*/
//	    testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryObject.properties"));
		/*VaryExtend*/
      testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryExtend.properties"));
	    /*VaryExtendValue*/
//      testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryExtendValue.properties"));
		testGen.systemOutAll();



	}
}
