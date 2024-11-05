package com.capstone.tradingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.tradingservice.model.Stock;

public interface StockRepository extends JpaRepository<Stock, String>{

}
