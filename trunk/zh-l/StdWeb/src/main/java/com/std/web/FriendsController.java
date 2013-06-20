package com.std.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.std.service.AccountEffectiveService;

@Controller
public class FriendsController {
	@Autowired
	private AccountEffectiveService accountService;

	public void setAccountService(AccountEffectiveService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping("/friends.htm")
	public String redirect() {
		accountService.deleteUser(123456L);
		return "friends";
	}
}
