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

    @Column(name="name")
    private String name;

    @Column(name="price")
    private String price;

    @Column(name="image")
    private String image;


 public void setId(int id) {
  this.id = id;
 }
 public int getId() {
  return id;
 }
 public void setName(String name) {
  this.name = name;
 }
 public void setImage(String img){this.image=img; }
 public String getImage(){return image;}
 public String getName() {
  return name;
 }

 public String getPrice() {
  return price;
 }


public Clothing_Article(){} // id is primary key so we dont include it
 public Clothing_Article(String name, String price,String img) {
  this.price = price;
  this.name = name;
  this.image = img;
 }

}
