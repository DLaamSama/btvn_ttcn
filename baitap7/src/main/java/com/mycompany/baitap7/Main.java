/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLiCanBo quanlicanbo = new QuanLiCanBo();
        while (true) {
            System.out.println("===============QUAN LI CAN BO==============");
            System.out.println("1.TRUY CAP DEN CAN BO");
            System.out.println("2.TIM KIEM CAN BO THEO TEN");
            System.out.println("3.XUAT THONG TIN CAC CAN BO");
            System.out.println("4.EXIT");
            System.out.println("====================================");
            int line = sc.nextInt();
            sc.nextLine();
            switch (line) {
                case 1: {
                    System.out.println("NHAN A DE TRUY CAP DEN CONG NHAN  ");
                    System.out.println("NHAN B DE TRUY CAP DEN KI SU ");
                    System.out.println("NHAN C DE TRUY CAP DEN NHAN VIEN  ");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("nhap ho ten :");
                            String hoten = sc.nextLine();
                            System.out.println("nhap vao gioi tinh :");
                            String gioitinh = sc.nextLine();
                            System.out.println("nhap vao dia chi :");
                            String diachi = sc.nextLine();
                            System.out.println("nhap vao tuoi :");
                            int tuoi = sc.nextInt();
                            System.out.println("nhap vao bac :");
                            int bac = sc.nextInt();
                            CanBo congnhan = new CongNhan(hoten, gioitinh, diachi, tuoi, bac);
                            quanlicanbo.addcanbo(congnhan);
                            System.out.println(congnhan.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.println("nhap ho ten :");
                            String hoten = sc.nextLine();
                            System.out.println("nhap vao gioi tinh :");
                            String gioitinh = sc.nextLine();
                            System.out.println("nhap vao dia chi :");
                            String diachi = sc.nextLine();
                            System.out.println("nhap vao tuoi :");
                            int tuoi = sc.nextInt();
                            System.out.println("nhap vao nghanh dao tao :");
                            String nganhdaotao = sc.nextLine();
                            CanBo kisu = new KiSu(hoten, gioitinh, diachi, tuoi, nganhdaotao);
                            quanlicanbo.addcanbo(kisu);
                            System.out.println(kisu.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.println("nhap ho ten :");
                            String hoten = sc.nextLine();
                            System.out.println("nhap vao gioi tinh :");
                            String gioitinh = sc.nextLine(); 
                            System.out.println("nhap vao dia chi :");
                            String diachi = sc.nextLine();
                            System.out.println("nhap vao tuoi :");
                            int tuoi = sc.nextInt();
                            System.out.println("nhap vao cong viec :");
                            String congviec = sc.nextLine();
                            CanBo nhanvien = new NhanVien(hoten, gioitinh, diachi, tuoi,congviec );
                            quanlicanbo.addcanbo(nhanvien);
                            System.out.println(nhanvien.toString());
                            sc.nextLine();
                            break;
                        }default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }

                case 2: {
                    System.out.println("Nhap ten de tim kiem :");
                    String name = sc.nextLine();
                    quanlicanbo.seacrhCanBo(name).forEach(CanBo -> {
                        System.out.println(CanBo.toString());
                    });
                    break;
                }
                case 3: {
                    quanlicanbo.showlistInforCanbo();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("invaied");
                    continue;
            }
        }

    }
}
