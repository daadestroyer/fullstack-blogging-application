package com.blogging.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blogging.backend.dto.UserDto;
import com.blogging.backend.repositories.UserRepo;

public interface UserService {
	
	
	// service to create user
	UserDto createUser(UserDto userDto); 
	
	// service to update user
	UserDto updateUser(UserDto userDto , int userId);
	
	// service to get user by id
	UserDto getUserById(int userId);
	
	// service to get all user
	List<UserDto> getAllUser();
	
	// service to delete user by id
	void deleteUserById(int userId);
	
}
