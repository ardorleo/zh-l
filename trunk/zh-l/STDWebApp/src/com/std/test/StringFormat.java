/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.test;

import java.text.NumberFormat;

/**
 * 
 * @author wb-zhuhai
 * @version $Id: StringFormat.java, v 0.1 2012-4-23 下午10:52:36 wb-zhuhai Exp $
 */
public class StringFormat {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        String strNumber="0";
        System.out.println(NumberFormat.getInstance().format(Long.parseLong(strNumber)));
    }

}
