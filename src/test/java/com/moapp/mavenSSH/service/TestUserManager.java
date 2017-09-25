package com.moapp.mavenSSH.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.moapp.mavenSSH.beans.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:Spring.xml","classpath:spring-hibernate.xml"

})
public class TestUserManager {
	private static final Logger LOGGER = Logger.getLogger(TestUserManager.class);

	 @Autowired
	 UserManager userManager;
	
	@Test
	public void save() {
		User user = new User();
		user.setUserName("wendy");
		user.setPassword("butterfly");
		user.setGender(1);
		Integer id = userManager.save(user);
		JSON.toJSONString(id);
		System.out.println(id);
	}
}
