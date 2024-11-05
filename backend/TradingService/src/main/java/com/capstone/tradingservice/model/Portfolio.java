package com.capstone.tradingservice.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {
	
	private String portfolioId;
    private String portfolioName;
    private String investmentAgenda;
    private Date createdAt;
    private Date updatedAt;
    private String userID;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Stock> stocks;

}
