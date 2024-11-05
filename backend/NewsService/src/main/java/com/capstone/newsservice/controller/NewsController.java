package com.capstone.newsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.newsservice.model.NewsArticle;
import com.capstone.newsservice.service.NewsService;

@RestController
@RequestMapping("/api/news")
public class NewsController {
	
    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<NewsArticle> getAllNews() {
        return newsService.getAllNews();
    }

    @PostMapping
    public void addNewsArticles(@RequestBody List<NewsArticle> articles) {
        for (NewsArticle article : articles) {
            String sentiment = newsService.analyzeSentiment(article.getDescription());
            article.setSentiment(sentiment);
        }
        newsService.saveNewsArticles(articles);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<NewsArticle> updateNewsArticle(
            @PathVariable("id") Long id,
            @RequestBody NewsArticle updatedArticle) {

        String sentiment = newsService.analyzeSentiment(updatedArticle.getDescription());
        updatedArticle.setSentiment(sentiment);
        
        NewsArticle updated = newsService.updateNewsArticle(id, updatedArticle);
        
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
