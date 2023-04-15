/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2;

/**
 *
 * @author ASUS
 */
public class student {
    private String name;
    private int age;
    private double score;
    private address Adress;

    public student(String name, int age, double score, address Adress) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.Adress = Adress;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public address getAdress() {
        return Adress;
    }

    public void setAdress(address Adress) {
        this.Adress = Adress;
    }
    public String getRating(){
        if(this.score <5.0){
            return "bad";
        }else if(this.score>=5 && this.score<8){
            return "medium";
        }else{
            return "good";
        }
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", age=" + age + ", score=" + score + ", Adress=" + Adress.toString() + '}';
    }
    
}
