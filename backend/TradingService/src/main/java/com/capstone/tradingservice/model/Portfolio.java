package com.capstone.tradingservice.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "portfolio")
public class Portfolio {
	
	@Id
	private String portfolioId;
    private String portfolioName;
    private String investmentAgenda;
    private Date createdAt;
    private Date updatedAt;
    private String userID;
    
    private List<Stock> stocks;

}
