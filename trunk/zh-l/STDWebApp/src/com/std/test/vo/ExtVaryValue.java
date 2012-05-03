package com.std.test.vo;


public class ExtVaryValue extends VaryValue {
	
	/* 变量值是连续型如[年龄阶段  16-21、21-26]
	 * 变量值是分类型如[性别    男、女]
	 * 如果为True表示是连续型,如果为false表示是分类型
	 */
	private boolean isContinuous;
	
	public boolean isContinuous() {
		return isContinuous;
	}

	public void setContinuous(boolean isContinuous) {
		this.isContinuous = isContinuous;
	}
}
