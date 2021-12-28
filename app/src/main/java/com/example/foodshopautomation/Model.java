package com.example.foodshopautomation;

public class Model {
    private String Name, Price, Description;
    int image;

    public Model(String name, String price, String description, int image) {
        Name = name;
        Price = price;
        Description = description;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
