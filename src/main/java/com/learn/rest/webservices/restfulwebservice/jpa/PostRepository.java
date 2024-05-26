package com.learn.rest.webservices.restfulwebservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.rest.webservices.restfulwebservice.User.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}