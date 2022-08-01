package com.krushnn.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.krushnn.demo.entity.User;

@Controller
public class UserController {
	@GetMapping("/form")
	public String loadUserForm(Model model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}
	@PostMapping("/saveUser")
	public String saveUser(@Valid User user, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "registerUser";
		}
		model.addAttribute("msg", "User Save SuccessFully------!!!");
		return "success";
		
	}

}
