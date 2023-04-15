/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap3;

/**
 *
 * @author ASUS
 */
public class circle {
    private String color;
    private double radius;

    public circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public circle() {
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" + "color=" + color + ", radius=" + radius + '}';
    }
    
    
}
