package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Users;
import com.example.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/home")
	public String home() {
		// http://localhost:8080/eBook/home
		// git test1
		return "home";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser() {
		// http://localhost:8080/eBook/saveUser
		Users users = new Users();
		users.setName("測試使用者");

		userService.saveUser(users);
		return "saveUser成功";
	}
}
