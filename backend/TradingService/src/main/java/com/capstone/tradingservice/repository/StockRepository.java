package com.capstone.tradingservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.capstone.tradingservice.model.Stock;

public interface StockRepository extends MongoRepository<Stock, String>{

}
