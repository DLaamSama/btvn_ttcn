/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4;

/**
 *
 * @author ASUS
 */
public class Staff extends person {
    private String school;
    private double lasary;

    public Staff(String school, double lasary, String name, String adrress) {
        super(name, adrress);
        this.school = school;
        this.lasary = lasary;
    }
   
    public Staff() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getLasary() {
        return lasary;
    }

    public void setLasary(double lasary) {
        this.lasary = lasary;
    }
    public void
    
}
