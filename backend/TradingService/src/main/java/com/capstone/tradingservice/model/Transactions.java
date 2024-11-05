package com.capstone.tradingservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transaction")
public class Transactions {
	
	@Id
	private String type;     // buy or sell
    private Date createdAt;
    private Integer quantity;
    private Double amount;
}
