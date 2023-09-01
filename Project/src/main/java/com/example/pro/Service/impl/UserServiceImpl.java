package com.example.pro.Service.impl;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.pro.Repository.UserRepository;
import com.example.pro.Service.UserService;
import com.example.pro.model.UserModel;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean addUser(UserModel user) {
		System.err.print("triggered");
		boolean userExists = userRepository.existsByEmail(user.getEmail());
		if(!userExists) {
			userRepository.save(user);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<UserModel> getUser() {
		return userRepository.findAll();
	}

	@Override
	public boolean updateUser(Long id,UserModel user) {
		Optional<UserModel> existingUserOptional = userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			UserModel userExists = existingUserOptional.get();
			userExists.setFirstName(user.getFirstName());
			userExists.setLastName(user.getLastName());
			userExists.setEmail(user.getEmail());
			userExists.setAddress(user.getAddress());
			userExists.setInTime(user.getInTime());
			userExists.setOutTime(user.getOutTime());

			userRepository.save(userExists);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) {
//		System.out.println("Inside");
		Optional<UserModel> existingUserOptional = userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			userRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Page<UserModel> getAllUser(PageRequest pageRequest){
		return userRepository.findAll(pageRequest);
	}
	@Override
	public List<UserModel> findAllQuery(){
		return userRepository.findAllQuery();
	}
	
//	@Override
//	public UserModel findByRoomNum(Long roomNum) {
//		return userRepository.findByRoomNum(roomNum);
//	}
//
	@Override
	public UserModel findByRoomNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findRoomNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findByRoomNum(Long roomNum) {
		// TODO Auto-generated method stub
		return null;
	}


}
