package com.learn.rest.webservices.restfulwebservice.User;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


@Entity(name ="user_Details")
public class User {
	
protected User() {
		
	}
@Id
@GeneratedValue
private Integer id;


@Size(min=2, message = "Name should have atleast 2 characters")
private String name;

@Past(message = "Birth Date should be in the past")
private LocalDate DateOfBirth;

@OneToMany(mappedBy = "user")
private List<Post> posts;


public User(Integer id, String name, LocalDate DateOfBirth) {
	super();
	this.id = id;
	this.name = name;
	this.DateOfBirth = DateOfBirth;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}




public LocalDate getDateOfBirth() {
	return DateOfBirth;
}


public void setDateOfBirth(LocalDate dateOfBirth) {
	DateOfBirth = dateOfBirth;
}


public List<Post> getPosts() {
	return posts;
}

public void setPosts(List<Post> posts) {
	this.posts = posts;
}


@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", DateOfBirth=" + DateOfBirth + "]";
}




	
}
