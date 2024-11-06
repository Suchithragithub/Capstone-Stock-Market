package com.capstone.newsservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.newsservice.model.NewsArticle;
import com.capstone.newsservice.repository.NewsArticleRepository;

@Service
public class NewsService {
	
    @Autowired
    private NewsArticleRepository newsArticleRepository;

    public List<NewsArticle> getAllNews() {
        return newsArticleRepository.findAll();
    }

    public void saveNewsArticles(List<NewsArticle> articles) {
        newsArticleRepository.saveAll(articles);
    }
    
    public NewsArticle updateNewsArticle(String id, NewsArticle updatedArticle) {
        Optional<NewsArticle> existingArticle = newsArticleRepository.findById(id);

        if (existingArticle.isPresent()) {
            NewsArticle article = existingArticle.get();
            article.setTitle(updatedArticle.getTitle());
            article.setDescription(updatedArticle.getDescription());
            article.setUrl(updatedArticle.getUrl());
            article.setPublishedAt(updatedArticle.getPublishedAt());
            article.setSentiment(updatedArticle.getSentiment());
            
            return newsArticleRepository.save(article);
        }
        return null;
    }

    public String analyzeSentiment(String text) {
    	String lowerCaseText = text.toLowerCase();
        
        if (lowerCaseText.contains("good") || lowerCaseText.contains("positive")) {
            return "Positive";
        } else if (lowerCaseText.contains("bad") || lowerCaseText.contains("negative")) {
            return "Negative";
        } else {
            return "Neutral";
        }
    }
    
    

}
