package com.example.Userms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Userms.entity.Post;
import com.example.Userms.entity.User;
import com.example.Userms.repository.PostRepository;
import com.example.Userms.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class Usercontroller {

	@Autowired
	private UserRepository userrepo;
	
	@Autowired
	private PostRepository postrepo;
	
	@GetMapping("/status")
	public String status(){
		return "Hii";
	}
	
	@PostMapping("/register")
	public User Register(@RequestBody User u){
		return userrepo.save(u);
	}
	
	@GetMapping("/allposts")
	public List<Post> getposts(){
		List<Post> p=postrepo.findAll();
		return p;
	}
	
	@PostMapping("/post/{userId}")
	public Post addpost(@RequestBody Post u,@PathVariable Long userId){
		User p=userrepo.getById(userId);
		u.setUser(p);
		return postrepo.save(u);
	}
	
	@GetMapping("/getuser/{userId}")
	public User getuser(@PathVariable Long userId){
		User u=userrepo.getById(userId);
		return u;
	}
}
