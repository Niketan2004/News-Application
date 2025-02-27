package com.project.News_Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.News_Application.Entity.News;
import com.project.News_Application.Services.NewsService;

@Controller
public class NewsController {
     @Autowired
     NewsService newsService;

     @GetMapping("/")
     public String getNews(Model model) {
          News news = newsService.getNews();
          System.out.println(news.toString());
          model.addAttribute("News", news);
          return "index";

     }
     //displays trending page
     @GetMapping("/trending")
     public String trendingNews(Model model )
     {

          return "Trending";
     }

     // display categories page
     @GetMapping("/categories")
     public String Categories(Model model )
     {

          return "Category";
     }
     
     

}
