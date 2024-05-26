package com.learn.rest.webservices.restfulwebservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.rest.webservices.restfulwebservice.User.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}