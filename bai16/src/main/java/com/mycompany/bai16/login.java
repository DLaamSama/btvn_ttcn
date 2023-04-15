/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai16;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String name =sc.nextLine();
        System.out.println("Nhap password");
        String password = sc.nextLine();
        if(name.equalsIgnoreCase("hello")&& password.length()>6){
            System.out.println("Dang nhap thanh cong ");
        }else{
            System.out.println("Sai username hay password");
        }
    }
}
