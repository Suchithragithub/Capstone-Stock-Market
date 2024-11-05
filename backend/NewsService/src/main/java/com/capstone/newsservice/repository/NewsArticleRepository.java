package com.capstone.newsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capstone.newsservice.model.NewsArticle;

public interface NewsArticleRepository extends MongoRepository<NewsArticle, Long> {
}
