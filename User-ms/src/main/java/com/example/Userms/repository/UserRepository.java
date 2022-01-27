package com.example.Userms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Userms.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
