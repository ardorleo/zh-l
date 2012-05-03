/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.web.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author wb-zhuhai
 * @version $Id: WebMethodInterceptor.java, v 0.1 2012-4-19 下午7:41:54 wb-zhuhai Exp $
 */
@Component
@Aspect
public class WebMethodInterceptor {
    //方法执行前调用  
    @After("execution (* com.alipay.dss.datasharing.web.varmanager.UserLockController.getVaryValue(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.toLongString());
        System.out.println(joinPoint.getArgs());

        System.out.println("before");
    }

}
