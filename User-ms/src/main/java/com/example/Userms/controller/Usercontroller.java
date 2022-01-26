package com.example.Userms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {

	@GetMapping("/status")
	public String status(){
		return "Hii";
	}
}
