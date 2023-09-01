package com.example.pro.Service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.pro.model.UserModel;

public interface UserService {
	public boolean addUser(UserModel user);
	public List<UserModel> getUser();
	public boolean updateUser(Long id, UserModel user);
	public boolean deleteUser(Long id);
	public Page<UserModel> getAllUser(PageRequest pageRequest);
	List<UserModel> findAllQuery();
	
	public UserModel findRoomNum();
	UserModel findByRoomNum();
	UserModel findByRoomNum(Long roomNum);
	
}