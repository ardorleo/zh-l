/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.test.jackson;

import java.net.URLDecoder;

import org.codehaus.jackson.map.ObjectMapper;


/**
 * 
 * @author wb-zhuhai
 * @version $Id: SerializeJackson.java, v 0.1 2012-4-12 下午5:52:59 wb-zhuhai Exp $
 */
public class SerializeJackson {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
//        ExtLoadCtrolTO extLoadToArray = om.readValue(URLDecoder.decode(configList, "UTF-8"),
//            ExtLoadCtrolTO.class);
    }

}
