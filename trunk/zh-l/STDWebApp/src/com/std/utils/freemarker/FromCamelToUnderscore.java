/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.utils.freemarker;

import java.util.List;

import com.std.utils.CommonUtils;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

/**
 * 
 * @author wb-zhuhai
 * @version $Id: test.java, v 0.1 2012-3-1 下午1:46:52 wb-zhuhai Exp $
 */
public class FromCamelToUnderscore implements TemplateMethodModel{

    @SuppressWarnings("rawtypes")
    public Object exec(List args) throws TemplateModelException {
        return CommonUtils.fromCamelToUnderscore((String)args.get(0));
    }

}
