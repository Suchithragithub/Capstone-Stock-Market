package com.capstone.tradingservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transactions {
	
	private String type;     // buy or sell
    private Date createdAt;
    private Integer quantity;
    private Double amount;
}
