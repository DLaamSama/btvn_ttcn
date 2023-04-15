/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class danh_sach_so_thuc {

    private ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        System.out.println("nhap danh sach so thuc");
        Scanner sc = new Scanner(System.in);
        int yes = 1;
        list.clear();
        
        do {
            System.out.println("nhap so: ");
            double num = sc.nextDouble();
            list.add(num);
            System.out.println("Ban co muon nhap tiep ? (1 :tiep /0 : thoat ");
            yes = sc.nextInt();
        } while (yes == 1);
    }

    public void xuat() {
        System.out.println("----------------------------");
        for (Double item : list) {
            System.out.print(item + "  ");
        }
        System.out.println("");
    }
    public void tong(){

        int sum=0;
        for(Double item: list){
            sum += item;
        }
        System.out.println("tong cac so la :" + sum);
    }
}
