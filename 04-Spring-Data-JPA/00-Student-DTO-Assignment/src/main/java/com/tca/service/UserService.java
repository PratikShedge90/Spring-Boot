package com.tca.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.dto.RegisterRequestDto;
import com.tca.entity.User;
import com.tca.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public List<RegisterRequestDto> getAllUsers()
	{
		List<User> user = userRepository.findAll();
		
		List<RegisterRequestDto> list= new LinkedList<>();
		
		for(User data : user)
		{
			list.add(mapToDto(data));
		}
		
		return list;
	}
	
	
	private static RegisterRequestDto mapToDto(User user)
	{
		RegisterRequestDto req = new RegisterRequestDto();
		req.setId(user.getId());
		req.setUsername(user.getUsername());
		req.setPassword(user.getPassword());
		return req;
	}

}
