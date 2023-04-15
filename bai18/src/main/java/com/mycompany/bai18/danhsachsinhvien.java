/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class danhsachsinhvien {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.printf("Nhap sinh vien thu %d :", i + 1);
            String hoten = sc.nextLine();
            if (hoten == null || hoten.equals("")) {
                System.out.println("Dung nhap ho ten !");
                break;
            }
            list.add(hoten);
            i++;
        } while (true);

        for (String item : list) {
            item = item.trim();
            if (item.startsWith("phan") || item.endsWith("nguyen")) {
                String ho = item.substring(0, item.indexOf(" "));
                String ten = item.substring(item.lastIndexOf(" "));
                String tendem = item.substring(item.indexOf(" "), item.lastIndexOf(" "));
                
                System.out.printf("ho ten : %s %s %s \n",ho.toUpperCase(),tendem,ten.toUpperCase());
                
            }
        }

    }
}
