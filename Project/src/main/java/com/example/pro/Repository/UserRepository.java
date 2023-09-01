package com.example.pro.Repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.pro.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

	boolean existsByEmail(String email);
	Optional<UserModel> findById(Long id);
	
	@Query("select u from UserModel u")
	List<UserModel> findAllQuery();
	


}