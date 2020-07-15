
package com.example.Clothing.service;

import com.example.Clothing.entity.Clothing_Article;

import java.util.List;

public interface Clothing_Article_Service {

    public List<Clothing_Article> findAll();
    public Clothing_Article findById(int theId);
    public void save(Clothing_Article theClothingArticle);
    public void deleteById(int theId);
}
