package com.example.Clothing.service;
import com.example.Clothing.dao.Clothing_Article_Repository;
import com.example.Clothing.entity.Clothing_Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothingArticleServiceImpl implements Clothing_Article_Service {


    Clothing_Article_Repository clothingArticleRepository;
    @Autowired
    public ClothingArticleServiceImpl(Clothing_Article_Repository clothingArticleRepository)
    {
        this.clothingArticleRepository = clothingArticleRepository;
    }

    @Override
    public List<Clothing_Article> findAll() {
        return clothingArticleRepository.findAll();
    }

    @Override
    public Clothing_Article findById(int theId) {
        Optional<Clothing_Article> result = clothingArticleRepository.findById(theId);
        Clothing_Article theClothingArticle =  null;
        if(result.isPresent()){
            theClothingArticle = result.get();}
        else throw new RuntimeException("did not find clothing article "+theId);
        return theClothingArticle;
    }

    @Override
    public void save(Clothing_Article theClothingArticle) {
        clothingArticleRepository.save(theClothingArticle);
    }

    @Override
    public void deleteById(int theId) {
        clothingArticleRepository.deleteById(theId);
    }
}
