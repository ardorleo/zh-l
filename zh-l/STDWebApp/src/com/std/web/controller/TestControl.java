package com.std.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.std.web.service.ITestService;

@Controller
public class TestControl {
	private static final Logger logger = Logger.getLogger(TestControl.class);
	@Autowired
	@Qualifier("testService")
	private ITestService testService;
	public ITestService getTestService() {
		return testService;
	}
	public void setTestService(ITestService testService) {
		this.testService = testService;
	}

	@RequestMapping(value = "/testAction", method = RequestMethod.GET)
	public void testAction(){
		logger.debug("hello Spring MVC Annotation!");
		testService.test("ok");
	}

	@RequestMapping(value = "/newcha", method = RequestMethod.GET)
	public void kaka(){
		logger.debug("hello Spring MVC Annotation!");
		testService.test("okx");
	}


}
