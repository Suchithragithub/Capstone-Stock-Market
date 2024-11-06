package com.capstone.tradingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.tradingservice.model.Portfolio;
import com.capstone.tradingservice.model.Stock;
import com.capstone.tradingservice.repository.PortfolioRepository;
import com.capstone.tradingservice.repository.StockRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private StockRepository stockRepository;

 

    public Portfolio createPortfolio(Portfolio portfolio) {
        portfolio.setCreatedAt(new Date());
        return portfolioRepository.save(portfolio);
    }

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    public Optional<Portfolio> getPortfolioById(String portfolioId) {
        return portfolioRepository.findById(portfolioId);
    }

    public Portfolio updatePortfolio(Portfolio portfolio) {
        portfolio.setUpdatedAt(new Date());
        return portfolioRepository.save(portfolio);
    }

    public void deletePortfolio(String portfolioId) {
        portfolioRepository.deleteById(portfolioId);
    }

    

    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStockById(String stockId) {
        return stockRepository.findById(stockId);
    }

    public Stock updateStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStock(String stockId) {
        stockRepository.deleteById(stockId);
    }
}

