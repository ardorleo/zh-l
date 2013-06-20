package com.std.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;
import com.std.entity.Team;
import com.std.entity.User;
import com.std.repository.mybatis.TeamMybatisDao;
import com.std.repository.mybatis.UserMybatisDao;

/**
 * 更高效的AccountService实现，基于MyBatis + Memcached的方案，以JSON格式存储Memcached中的内容。
 *
 * @author calvin
 */
@Component
@Transactional(readOnly = true)
public class AccountEffectiveService {

	@Autowired
	private UserMybatisDao userDao;
	@Autowired
	private TeamMybatisDao teamDao;

	public Team getTeamWithDetail(Long id) {
		return teamDao.getWithDetail(id);
	}

	public List<User> searchUser(String loginName, String name) {
		Map<String, Object> parameters = Maps.newHashMap();
		parameters.put("loginName", loginName);
		parameters.put("name", name);
		return userDao.search(parameters);
	}

	@Transactional
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Transactional
	public void deleteUser(Long id) {
		userDao.delete(id);
	}
}
