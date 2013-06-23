package com.std.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.std.entity.User;
import com.std.service.AccountEffectiveService;

@Controller
public class FriendsController {
	@Autowired
	private AccountEffectiveService accountService;

	@RequestMapping("/friends.htm")
	public String redirect() throws JsonProcessingException {
		List<User> userList=accountService.searchUser("spring", "spring_hello");
		ObjectMapper om=new ObjectMapper();
		System.out.println(om.writeValueAsString(userList));
		return "friends";
	}
}
