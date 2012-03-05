package com.std.tools.gen;

import java.io.IOException;

import com.std.tools.gen.data.impl.SimpleTemplateData;

import freemarker.template.TemplateException;

public class DataShare2Gen {
	public static void main(String [] args) throws IOException, TemplateException{
//		GeneralGen testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryValue.properties"));
//		testGen.systemOutAll();
	    GeneralGen testGen=new GeneralGen(new SimpleTemplateData("com/std/tools/gen/profiles/Datashare/VaryObject.properties"));
        testGen.systemOutAll();
	}
}
