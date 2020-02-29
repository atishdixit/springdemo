package com.indian.admin.adminapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indian.admin.adminapp.configuration.User;

@Controller
public class LoginController {

	@Autowired
	private User user;
	
	@RequestMapping(value = { "", "/", "login" }, method = RequestMethod.GET)
	public String login(Model model) {
		return "loginpage/login";
	}

	@RequestMapping(value = { "login.do" }, method = RequestMethod.POST)
	public String doLogin(Model model) {
		System.out.println(user.getName());
		return "indianbankhome";
	}
}
