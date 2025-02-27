package com.project.News_Application.Entity;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Articles {
     private String article_id;
     private String title;
     private String link;
     private ArrayList<String> keywords;
     private ArrayList<String> creator;
     private Object video_url;
     private String description;
     private String content;
     private String pubDate;
     private String pubDateTZ;
     private String image_url;
     private String source_id;
     private String source_name;
     private String source_url;
     private String source_icon;
     private String language;
     private ArrayList<String> country;
     private ArrayList<String> category;
     private boolean duplicate;
}