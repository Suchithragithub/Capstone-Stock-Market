package com.capstone.tradingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.tradingservice.model.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, String>{

}
