/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        address Address = new address("viet nam", "ha noi", "hoai duc", "88 tay lai xa");
        student Student = new student();
        Student.setName("phan van nguyen");
        Student.setAge(20);
        Student.setScore(9.0);
        Student.setAdress(Address);
        System.out.println(Student.toString());
        System.out.println("xep loai : "+Student.getRating());
    }
}
