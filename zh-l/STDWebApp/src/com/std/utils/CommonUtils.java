/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author wb-zhuhai
 * @version $Id: CommonUtils.java, v 0.1 2012-2-29 下午2:30:47 wb-zhuhai Exp $
 */
public class CommonUtils {

    private final static Calendar nowCalendar = Calendar.getInstance();

    /**
     * 返回当前年份<br>
     * 格式例如:2012
     * @return
     */
    public static String getNowYear() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", Locale.CHINA);
        dateFormat.setCalendar(nowCalendar);
        return dateFormat.format(nowCalendar.getTime());
    }

    /**
     * 返回当前日期<br>
     * 格式例如：2012-02-19
     * @return
     */
    public static String getNowDay() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ", Locale.CHINA);
        dateFormat.setCalendar(nowCalendar);
        return dateFormat.format(nowCalendar.getTime());
    }

    /**
     * 返回当前时间<br>
     * 格式例如：下午 02:59:25
     * @return
     */
    public static String getNowTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("a hh:mm:ss ", Locale.CHINA);
        dateFormat.setCalendar(nowCalendar);
        return dateFormat.format(nowCalendar.getTime());
    }

    /**
     * 返回当前日期和时间<br>
     * 格式例如：2012-02-19 下午 02:59:25
     * @return
     */
    public static String getNowDayTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss", Locale.CHINA);
        dateFormat.setCalendar(nowCalendar);
        return dateFormat.format(nowCalendar.getTime());
    }


    /**
     * @param string
     *            in the "camel" notation like "beMyCamel"
     * @return the resulting string in usual notation like "be_my_camel"
     */
    public static String fromCamelToUnderscore(String string) {
        int size = string.length();
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            char c = string.charAt(i);
            if (i > 0 && i < size - 1) {
                char next = string.charAt(i + 1);
                char prev = string.charAt(i - 1);
                if (Character.isUpperCase(c) && Character.isJavaIdentifierPart(next)
                        && Character.isJavaIdentifierPart(prev)
                        && !Character.isUpperCase(next)) {
                    sb.append('_');
                    c = Character.toLowerCase(c);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @param string
     *            in the "underscore" notation like "be_my_camel"
     * @return the resulting string in "camel" notation like "beMyCamel"
     */
    public static String fromUnderscoreToCamel(String string) {
        int size = string.length();
        StringBuffer sb = new StringBuffer(size);
        boolean skipChar = false;
        boolean toUpper = false;
        for (int i = 0; i < size; i++) {
            char c = string.charAt(i);
            skipChar = i > 0 && c == '_';
            if (skipChar && i < size - 1
                    && !Character.isJavaIdentifierPart(string.charAt(i + 1))) {
                skipChar = false;
            } else if (i == size - 1) {
                skipChar = false;
            }
            if (!skipChar) {
                if (toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    if (i > 0) {
                        if (Character.isJavaIdentifierPart(string.charAt(i - 1))) {
                            sb.append(Character.toLowerCase(c));
                        } else {
                            sb.append(c);
                        }
                    } else {
                        sb.append(Character.toLowerCase(c));
                    }
                }
            }
            toUpper = skipChar;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String tempStr="servicePackage,dataObjectPackage,author,nowYear,nowDayTime,service,dataDao,dataObject,tableColList,obFeildList,colFieldMap,fieldColMap";
        String tempStrArray[]=tempStr.split(",");
        for (int i = 0; i < tempStrArray.length; i++) {
            System.out.println(fromCamelToUnderscore(tempStrArray[i]).toUpperCase());
        }
    }
}
