/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap5;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape {

  private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    

    @Override
    public double getArea() {
        return Math.PI * this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "-ban kinh:"+this.getRadius()+"-color:"+this.getColor()+"-filled: "+this.filled;
    }
    

}
