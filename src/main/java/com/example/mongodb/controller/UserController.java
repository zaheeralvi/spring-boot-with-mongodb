package com.example.mongodb.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mongodb.modal.User;
import com.example.mongodb.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository repository;

	@RequestMapping ("/")
	@ResponseBody
	public String add() {
		User user=new User();
		
		user.setId(2);
		user.setName("Ahmad");
		user.setAddress("Sialkot");
		user.setAge(24);
		repository.save(user);
		return "New User  Succeffully";
	}
	
//	@RequestMapping ("/all")
//	@ResponseBody
//	public Iterable<User> all() {
//		Iterable<User> users= repository.findAll();
//		return users;
//	}
	
}
