package com.capstone.tradingservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "stock")
public class Stock {
	
	@Id
	private String stockId;
    private String stockName;
    private Double totalBuy;
    private Double totalSell;
    
    
    private List<Transactions> transactions;

}
