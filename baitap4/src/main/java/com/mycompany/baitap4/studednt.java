/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4;

/**
 *
 * @author ASUS
 */
public class studednt extends person {

    private String program;
    private int year;
    private double score;

    public studednt(String program, int year, double score, String name, String adrress) {
        super(name, adrress);
        this.program = program;
        this.year = year;
        this.score = score;
    }

    public studednt() {
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        if (this.score < 5) {
            return "bad";
        } else if (this.score >= 5 && this.score < 8) {
            return "medium";
        } else {
            return "good";
        }

    }

}
