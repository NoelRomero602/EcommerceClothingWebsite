package com.example.Clothing.entity;

import javax.persistence.*;

@Entity // shows this is an object class and we want this as our table class
@Table(name="Clothing_Article")

public class Clothing_Article
{

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
    private int id;

    @Column(name="category")
    private String category;

    @Column(name="description")
    private String description;



 public void setId(int id) {
  this.id = id;
 }
 public int getId() {
  return id;
 }
 public void setCategory(String catagory) {
  this.category = catagory;
 }

 public String getCategory() {
  return category;
 }

 public String getDescription() {
  return description;
 }


public Clothing_Article(){} // id is primary key so we dont include it
 public Clothing_Article(String category, String description) {
  this.description = description;
  this.category = category;

 }

}
