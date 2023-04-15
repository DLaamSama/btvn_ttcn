/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        author AT = new author("Phan Van Nguyen", "Trongphan@gmail.com","meli", 23);
        book Bok = new book("Java OOP", AT, 23, 100);
        System.out.println(Bok.toString());
    }
}
