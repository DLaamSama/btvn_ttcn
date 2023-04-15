/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap5;

/**
 *
 * @author ASUS
 */
public class rectangle extends Shape{
    private double width,leigh;

    public rectangle(double width, double leigh, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.leigh = leigh;
    }

    public rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLeigh() {
        return leigh;
    }

    public void setLeigh(double leigh) {
        this.leigh = leigh;
    }


    @Override
    public double getArea() {
return this.leigh*this.width;
    }

    @Override
    public double getPerimeter() {
return this.leigh+this.width;
    }

    @Override
    public String toString() {
        return "-chieu dai"+this.width+"-chieu rong :"+this.leigh + "-color:"+this.getColor()+"-filled: "+this.filled;

    }
    
}
