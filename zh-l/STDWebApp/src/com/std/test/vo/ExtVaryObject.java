package com.std.test.vo;

import java.util.ArrayList;
import java.util.List;


/**
 * 扩展变量对象
 * @author jun.liu
 */
public class ExtVaryObject extends VaryObject {
	
	/*变量所包含的值*/
	List<ExtVaryValue> valueList = new ArrayList<ExtVaryValue>();
	
	public List<ExtVaryValue> getValueList() {
		return valueList;
	}

	public void setValueList(List<ExtVaryValue> valueList) {
		this.valueList = valueList;
	}

}
