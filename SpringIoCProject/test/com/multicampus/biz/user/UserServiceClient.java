package com.multicampus.biz.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����Ѵ�.
		ApplicationContext factory = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. UserService Ÿ���� ��ü�� Lookup�Ѵ�.
		UserService userService = 
			(UserService) factory.getBean("userService");
		
		// 3. �α��� ����
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
	}
}






