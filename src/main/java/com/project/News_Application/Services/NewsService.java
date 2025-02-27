package com.project.News_Application.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.project.News_Application.Entity.News;

@Service
public class NewsService {
     @Value("${NEWS_API_KEY_2}")
     private String API_KEY;
     private String baseUrl = "https://newsdata.io/api/1/latest?apikey=";

     // returns latest news
     public News getLatestNews() {
          String newUrl = baseUrl + API_KEY + "&language=en";
          return getNews(newUrl);
     }

     // returns news by category
     public News getNewsByCategory(String category) {
          String newUrl = baseUrl + API_KEY + "&category=" + category;
          return getNews(newUrl);
     }

     // returns news by category
     public News getTrendingNews() {
          String newUrl = baseUrl + API_KEY + "&";
          return getNews(newUrl);
     }
     // IT NEEDS SUBSCRIPTIONS THATS WHY IT IS NOT USED
     // // returns crypto news
     // public News getCryptoNews() {
     //
     // String newUrl = "https://newsdata.io/api/1/crypto?apikey=" + API_KEY;
     // return getNews(newUrl);
     // }

     // Hits the url and get all the news data
     private News getNews(String finalUrl) {

          // Initialize resttemplate to hit the url
          RestTemplate restTemplate = new RestTemplate();
          // hits url and retrieves data
          ResponseEntity<String> news = restTemplate.getForEntity(finalUrl, String.class);
          // System.out.println("Raw JSON: " + news.getBody());
          // If url is successfully hited then alll the data is mapped with java object
          // class
          if (news.getStatusCode() == HttpStatus.OK) {
               try {
                    ObjectMapper objectMapper = new ObjectMapper();
                    News newsData = objectMapper.readValue(news.getBody(), News.class);
                    // System.out.println(newsData.toString());
                    return newsData;

               } catch (Exception e) {
                    System.out.println(e.getMessage());
                    throw new RuntimeJsonMappingException("Failed to mapped JSON data to JAva object" + e.getMessage());
               }
          } else {
               throw new RuntimeException("News not found");
          }
     }

}
