/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap9;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLiTaiLieu quanli = new QuanLiTaiLieu();
        while (true) {

            System.out.println("================CHUONG TRINH ===============");
            System.out.println("1.THEM MOI TAI LIEU SACH,TAP CHI, BAO !");
            System.out.println("2.XOA TAI LIEU THEO MA ID!");
            System.out.println("3.HIEN TONG TAI LIEU!");
            System.out.println("4.TIM TAI LIEU THEO SACH ,BAO ,TAP CHI !");
            System.out.println("5.THOAT!");
            System.out.println("MOI BAN CHON CHUONG TRINH ");
            System.out.println("=============================================");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {

                }
                case 2: {
                    System.out.println("-------------------------");
                    System.out.println("A.SEARCH BOOK");
                    System.out.println("B.SEARCH BAO");
                    System.out.println("C.SEARCH TAP CHI");
                    System.out.println("MOI BAN CHON ");
                    System.out.println("------------------------");
                    String chon = sc.nextLine();
                    switch (chon) {
                        case "a": {
                            quanli.seachbysach();
                            break;
                        }
                        case "b": {
                            quanli.seachbybao();
                            break;
                        }
                        case "c": {
                            quanli.seachbytapchi();
                            break;
                        }
                    }
                }
                case 3: {
                    quanli.showinformation();
                    break;
                }
                case 4:{
                    quanli.
                }
            }
        }
    }

}
