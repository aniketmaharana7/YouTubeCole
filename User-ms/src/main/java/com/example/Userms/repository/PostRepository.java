package com.example.Userms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Userms.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
