package com.lwh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwh.entitis.User;
import com.lwh.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("User", new User());
		return "index";
	}

	
	@PostMapping("/test")
	public String Test(@ModelAttribute User user, Model model) {
		model.addAttribute("User", user);
		System.out.println(user);
		return user.getName();
	}

	@RequestMapping("/likeName")
	@ResponseBody
	public String likeName(String name) {
		System.out.println(userService.likeName(name));
		return "123";
	}
}
