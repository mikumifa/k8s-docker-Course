package com.example.userservice.controller;

import com.example.userservice.domain.User;
import com.example.userservice.domain.UserVO;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * Author: Grissom date: 2020/7/9 8:24 下午
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User add(@RequestBody User user) {
		return userService.add(user);
	}

	@GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserVO get(@RequestParam("id") long id) {
		User u = userService.get(id);
		String hostname = System.getenv("POD_NAME");
		return new UserVO(u.getId(), u.getName(), u.getPwd(),hostname);
	}
}
