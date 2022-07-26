package com.blogging.backend.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blogging.backend.dto.UserDto;
import com.blogging.backend.entities.User;
import com.blogging.backend.repositories.UserRepo;
import com.blogging.backend.services.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub

	}

	private User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getUserId());
		user.setName(userDto.getUserName());
		user.setEmail(userDto.getUserEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getUserPassword());
		return user;
	}

	private UserDto userToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getId());
		userDto.setUserName(user.getName());
		userDto.setUserEmail(user.getEmail());
		user.setAbout(user.getAbout());
		user.setPassword(user.getPassword());
		return userDto;
	}

}
