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
    public static int getNowYear() {
        return nowCalendar.get(Calendar.YEAR);
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

    public static void main(String[] args) {
        System.out.println(getNowTime());
    }
}
