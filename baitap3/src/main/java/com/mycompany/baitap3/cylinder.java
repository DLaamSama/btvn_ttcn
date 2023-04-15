/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap3;

/**
 *
 * @author ASUS
 */
public class cylinder extends circle {
    private double height;

    public cylinder(double height, String color, double radius) {
        super(color, radius);
        this.height = height;
    }

    public cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   public double getvolume(){
       return super.getArea()*this.height;
   }
 
    
}
