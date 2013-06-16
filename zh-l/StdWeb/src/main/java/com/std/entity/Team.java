package com.std.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.google.common.collect.Lists;

/**
 * 开发团队.
 *
 * @author calvin
 */

public class Team extends IdEntity {

	private String name;
	private User master;
	private List<User> userList = Lists.newArrayList();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull
	public User getMaster() {
		return master;
	}

	public void setMaster(User master) {
		this.master = master;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
