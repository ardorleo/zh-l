/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.std.test.vo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author wb-zhuhai
 * @version $Id: VaryObject.java, v 0.1 2012-03-14 上午 09:56:32 wb-zhuhai Exp $
 */

public class VaryObject implements Serializable {

    private static final long serialVersionUID = 3990390024996476430L;
    /** 变量ID */
    private String            id;
    /** 模块ID */
    private String            moduleId;
    /** 变量名称 */
    private String            name;
    /** 变量对应宽表字段名 */
    private String            varColName;
    /** 变量类型 */
    private String            varType;
    /** 变量所属组ID */
    private String            parentGroupId;
    /** 是否为组 */
    private String            isGroup;
    /** 计算变量公式 */
    private String            calFormula;
    /** 变量输入模板 */
    private String            inputTemplate;
    /** 是否首次类目选择 */
    private String            isClassUsed;
    /** 删除标记 */
    private String            isDeleted;
    /** 变量注释 */
    private String            memo;
    /** 输入提示 */
    private String            inputTips;

    private List<VaryObject>  childNodeList;

    public List<VaryObject> getChildNodeList() {
        return childNodeList;
    }

    public void setChildNodeList(List<VaryObject> childNodeList) {
        this.childNodeList = childNodeList;
    }

    /**
     * 设置  变量ID 的值
     * @return
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回  变量ID 的值
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * 设置  模块ID 的值
     * @return
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 返回  模块ID 的值
     * @return
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * 设置  变量名称 的值
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回  变量名称 的值
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  变量对应宽表字段名 的值
     * @return
     */
    public void setVarColName(String varColName) {
        this.varColName = varColName;
    }

    /**
     * 返回  变量对应宽表字段名 的值
     * @return
     */
    public String getVarColName() {
        return varColName;
    }

    /**
     * 设置  变量类型 的值
     * @return
     */
    public void setVarType(String varType) {
        this.varType = varType;
    }

    /**
     * 返回  变量类型 的值
     * @return
     */
    public String getVarType() {
        return varType;
    }

    /**
     * 设置  变量所属组ID 的值
     * @return
     */
    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    /**
     * 返回  变量所属组ID 的值
     * @return
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    /**
     * 设置  是否为组 的值
     * @return
     */
    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup;
    }

    /**
     * 返回  是否为组 的值
     * @return
     */
    public String getIsGroup() {
        return isGroup;
    }

    /**
     * 设置  计算变量公式 的值
     * @return
     */
    public void setCalFormula(String calFormula) {
        this.calFormula = calFormula;
    }

    /**
     * 返回  计算变量公式 的值
     * @return
     */
    public String getCalFormula() {
        return calFormula;
    }

    /**
     * 设置  变量输入模板 的值
     * @return
     */
    public void setInputTemplate(String inputTemplate) {
        this.inputTemplate = inputTemplate;
    }

    /**
     * 返回  变量输入模板 的值
     * @return
     */
    public String getInputTemplate() {
        return inputTemplate;
    }

    /**
     * 设置  是否首次类目选择 的值
     * @return
     */
    public void setIsClassUsed(String isClassUsed) {
        this.isClassUsed = isClassUsed;
    }

    /**
     * 返回  是否首次类目选择 的值
     * @return
     */
    public String getIsClassUsed() {
        return isClassUsed;
    }

    /**
     * 设置  删除标记 的值
     * @return
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 返回  删除标记 的值
     * @return
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置  变量注释 的值
     * @return
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 返回  变量注释 的值
     * @return
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置  输入提示 的值
     * @return
     */
    public void setInputTips(String inputTips) {
        this.inputTips = inputTips;
    }

    /**
     * 返回  输入提示 的值
     * @return
     */
    public String getInputTips() {
        return inputTips;
    }
}