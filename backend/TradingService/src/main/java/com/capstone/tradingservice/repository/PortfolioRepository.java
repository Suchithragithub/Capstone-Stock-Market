package com.capstone.tradingservice.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.capstone.tradingservice.model.Portfolio;

public interface PortfolioRepository extends MongoRepository<Portfolio, String>{

}
