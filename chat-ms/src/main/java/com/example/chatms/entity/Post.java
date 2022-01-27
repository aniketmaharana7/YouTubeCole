package com.example.chatms.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long postId;
	private String url;
	
	@ManyToOne
	private User user;
	
	
	@Convert(converter=StringSetConverter.class)
	private Set<String> userLikes=new HashSet<String>();
	
	@Convert(converter=StringSetConverter.class)
	private Set<String> userDislikes=new HashSet<String>();
	
	
	public Post(Long postId, String url, User user, Set<String> userLikes, Set<String> userDislikes) {
		super();
		this.postId = postId;
		this.url = url;
		this.user = user;
		this.userLikes = userLikes;
		this.userDislikes = userDislikes;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<String> getUserLikes() {
		return userLikes;
	}

	public void setUserLikes(Set<String> userLikes) {
		this.userLikes = userLikes;
	}

	public Set<String> getUserDislikes() {
		return userDislikes;
	}

	public void setUserDislikes(Set<String> userDislikes) {
		this.userDislikes = userDislikes;
	}

	
	
}
