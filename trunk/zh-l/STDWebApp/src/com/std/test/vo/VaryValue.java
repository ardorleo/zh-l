/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.test.vo;
import java.io.Serializable;

/**
 *
 * @author wb-zhuhai
 * @version $Id: VaryValue.java, v 0.1 2012-03-27 下午 07:13:10 wb-zhuhai Exp $
 */

public class VaryValue implements Serializable {

    private static final long serialVersionUID = -3911287192067284012L;
    /** 变量ID */
    private String id;
    /** 变量值 */
    private String varyValue;
    /** 变量值名称 */
    private String varyValueName;
    /** 删除标记 */
    private String isDeleted;
    /** 数据标识符 */
    private String dataFlagTime;
    /**
     * 设置  变量ID 的值
     * @return
     */
    public void setId(String id){
      this.id = id;
    }
    /**
     * 返回  变量ID 的值
     * @return
     */
    public String getId(){
      return id;
    }
    /**
     * 设置  变量值 的值
     * @return
     */
    public void setVaryValue(String varyValue){
      this.varyValue = varyValue;
    }
    /**
     * 返回  变量值 的值
     * @return
     */
    public String getVaryValue(){
      return varyValue;
    }
    /**
     * 设置  变量值名称 的值
     * @return
     */
    public void setVaryValueName(String varyValueName){
      this.varyValueName = varyValueName;
    }
    /**
     * 返回  变量值名称 的值
     * @return
     */
    public String getVaryValueName(){
      return varyValueName;
    }
    /**
     * 设置  删除标记 的值
     * @return
     */
    public void setIsDeleted(String isDeleted){
      this.isDeleted = isDeleted;
    }
    /**
     * 返回  删除标记 的值
     * @return
     */
    public String getIsDeleted(){
      return isDeleted;
    }
    /**
     * 设置  数据标识符 的值
     * @return
     */
    public void setDataFlagTime(String dataFlagTime){
      this.dataFlagTime = dataFlagTime;
    }
    /**
     * 返回  数据标识符 的值
     * @return
     */
    public String getDataFlagTime(){
      return dataFlagTime;
    }
}