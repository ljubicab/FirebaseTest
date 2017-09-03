package com.example.ljubica.firebasetest;

/**
 * Created by Ljubica on 3.9.2017..
 */

public class Item {

    private String title;
    private String category;
    private String date;
    private String description;


    public Item(String title, String category, String date, String description) {

        this.setTitle(title);
        this.setCategory(category);
        this.setDate(date);
        this.setDescription(description);


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
