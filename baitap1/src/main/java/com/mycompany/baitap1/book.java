/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1;

/**
 *
 * @author ASUS
 */
public class book {
    private String name;
    private author Author;
    private int count;
    private double price;

    public book(String name, author Author, int count, double price) {
        this.name = name;
        this.Author = Author;
        this.count = count;
        this.price = price;
    }

    public book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public author getAuthor() {
        return Author;
    }

    public void setAuthor(author Author) {
        this.Author = Author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" + "name=" + name + ", Author=" + Author + ", count=" + count + ", price=" + price + '}';
    }
    
}
