
package com.example.Clothing.controller;

import com.example.Clothing.entity.Clothing_Article;
import com.example.Clothing.service.Clothing_Article_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Clothing_Article_RestController {
    Clothing_Article_Service clothingArticleService;
    @Autowired
    Clothing_Article_RestController(Clothing_Article_Service clothingArticleService)
    {
        this.clothingArticleService = clothingArticleService;
    }
    // get a list of clothing
    @GetMapping("/clothing")
    public List<Clothing_Article> findAll(){return clothingArticleService.findAll();}

    // GET Request by id
    @GetMapping("/clothing/{clothingId}")
    public Clothing_Article getClothingArticle(@PathVariable int clothingId)
    {
         Clothing_Article clothing_article = clothingArticleService.findById(clothingId);
         if(clothing_article == null) throw new RuntimeException("Clothing not found, ID: "+clothingId);
         return clothing_article;
    }
    @PostMapping("/clothing")
    public Clothing_Article postClothingArticle(@RequestBody Clothing_Article clothing_article)
    {
        clothing_article.setId(0);
        clothingArticleService.save(clothing_article);
        return clothing_article;
    }
    // request for put/updating existing category/description by id
    @PutMapping("/clothing")
    public Clothing_Article updateClothingArticle(@RequestBody Clothing_Article clothing_article)
    {
        clothingArticleService.save(clothing_article);
        return clothing_article;
    }
    // delete a clothing article by id
    @DeleteMapping("/clothing/{clothingId}")
    public String deleteClothing(@PathVariable int clothingId)
    {
        Clothing_Article clothing_article = clothingArticleService.findById(clothingId);
        if (clothing_article == null) throw new RuntimeException("clothing id not found "+clothingId);
        clothingArticleService.deleteById(clothingId);
        return "deleted clothing article id " + clothingId;
    }
}
