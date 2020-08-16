package com.demo.cicd.cicd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cicd.cicd.dao.UserRepository;
import com.demo.cicd.cicd.model.User;

@RestController
@RequestMapping(path = "/cicd")
public class Controller {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/message")
	public String message() {
		return "My First CI/CD";
	}

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}

}
