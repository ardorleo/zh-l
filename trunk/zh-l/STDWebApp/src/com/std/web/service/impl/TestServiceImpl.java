package com.std.web.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.std.web.service.ITestService;

@Service("testService")
public class TestServiceImpl extends BaseServiceImpl implements ITestService {

	@Transactional(rollbackFor={Exception.class})
	public void test(String value) {
		System.out.println(value);
	}

}
