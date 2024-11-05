package com.capstone.newsservice.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "news")
public class NewsArticle {
	
    @Id
    private Long id;
    private String title;
    private String description;
    private String url;
    private LocalDateTime publishedAt;
    private String sentiment; // Positive, Neutral, Negative

    
}
