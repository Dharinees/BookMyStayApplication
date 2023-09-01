package com.example.pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.pro.model.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {

}
