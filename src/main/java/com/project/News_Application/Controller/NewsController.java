package com.project.News_Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.project.News_Application.Entity.News;
import com.project.News_Application.Services.NewsService;

@Controller
public class NewsController {
     @Autowired
     NewsService newsService;

     @GetMapping("/")
     public String getNews(Model model) {
          News news = newsService.getLatestNews();
          // System.out.println(news.toString());
          model.addAttribute("News", news);
          return "index";

     }

     // displays trending page
     @GetMapping("/trending")
     public String trendingNews(Model model) {
          String category = "top";
          News news = newsService.getNewsByCategory(category);
          model.addAttribute("News", news);
          return "Trending";
     }

     // display categories page
     @GetMapping("/categories")
     public String Categories() {
          return "Category";
     }

     // display categories page
     @GetMapping("/category/{category}")
     public String showCategoryNews(@PathVariable String category, Model model) {
          // Because to get Crypto news it requires to pay the website ..so it is not used
          // if (category.equals("crypto")) {
          // News cryptoNews = newsService.getCryptoNews();
          // model.addAttribute("News", cryptoNews);
          // return "index";
          // }
          News news = newsService.getNewsByCategory(category);
          model.addAttribute("News", news);
          return "index";
     }

}
