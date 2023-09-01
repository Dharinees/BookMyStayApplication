package com.example.pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.pro.model.Room;



public interface RoomRepository extends JpaRepository<Room, Long> {

	}

