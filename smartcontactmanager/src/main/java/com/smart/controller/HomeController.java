package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;


//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import com.smart.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;

@Controller
public class HomeController {
	@Autowired
	private UserRepository userRepository;
@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user=new User();
		user.setName("Akash das");
        user.setEmail("ff@gg.io");
		return "Working";
	}
	
@RequestMapping("/")
public String home(Model model)
{
	model.addAttribute("title","Home - Smart Contact Manager");
	return "home";
}

@RequestMapping("/about")
public String about(Model model)
{
	model.addAttribute("title","About - Smart Contact Manager");
	return "about";
}
@RequestMapping("/signup")
public String signup(Model model)
{
	model.addAttribute("title","Register - Smart Contact Manager");
	model.addAttribute("user",new User());
	return "signup";
}
}
