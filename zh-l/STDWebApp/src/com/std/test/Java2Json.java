/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.std.test.vo.VaryObject;

/**
 * 
 * @author wb-zhuhai
 * @version $Id: Java2Json.java, v 0.1 2012-3-14 下午4:08:08 wb-zhuhai Exp $
 */
public class Java2Json {
    public static void main(String [] args) throws JsonGenerationException, JsonMappingException, IOException{
        List<VaryObject> voList=new ArrayList<VaryObject>();
        VaryObject obtest=new VaryObject();
        voList.add(obtest);
        voList.add(new VaryObject());
        voList.add(new VaryObject());
        voList.add(new VaryObject());
        voList.add(new VaryObject());
        voList.add(new VaryObject());
        voList.add(new VaryObject());
        List<VaryObject> voList1=new ArrayList<VaryObject>();
        voList1.add(new VaryObject());
        voList1.add(new VaryObject());
        voList1.add(new VaryObject());
        voList1.add(new VaryObject());
        voList1.add(new VaryObject());
        voList1.add(new VaryObject());
        voList1.add(new VaryObject());
        obtest.setChildNodeList(voList1);
        ObjectMapper mapper = new ObjectMapper(); 
        mapper.writeValue(new File("user-modified.json"), voList);
    }
}
