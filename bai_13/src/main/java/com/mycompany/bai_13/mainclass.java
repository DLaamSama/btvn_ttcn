/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_13;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class mainclass {

    public static void main(String[] args) {
        danh_sach_so_thuc ds = new danh_sach_so_thuc();
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("Menu chuong trinh : ");
            System.out.println("1 nhap danh sach: ");
            System.out.println("2 hien thhi danh sach: ");
            System.out.println("3 tinh tong :");
            System.out.println("0 thoat chuong trinh ");
            chon = s.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 0:
                        System.exit(0);
                    case 1:
                        ds.nhap();
                        break;
                    case 2:
                        ds.xuat();
                        break;
                    case 3:
                        ds.tong();
                        break;
                    default:
                        System.out.println("Nhap sai roi moi ban chon lai ");
                }
            }
        } while (chon != 0);
        System.out.println("chuong trinh ket thuc ");
    }
}
