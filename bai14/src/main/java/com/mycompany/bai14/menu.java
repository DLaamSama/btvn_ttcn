/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class menu {

    private ArrayList<String> list = new ArrayList<>();

    public void nhap() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap danh sach ho ten : ");
            String ht = sc.nextLine();
            if (ht.isEmpty()) {
                break;
            }
            list.add(ht);
        } while (true);
    }

    public void xuat() {
        System.out.println("danh sach ho ten la : ");
        for (String item : list) {
            System.out.println(" " + item);

        }
    }

    public void sapxep() {
        Collections.sort(list, (a, b) -> a.compareTo(b));
        xuat();
    }

    public void ngaunhien() {
        Collections.shuffle(list);
        xuat();
    }

    public void timvaxoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho ten can tim ");
        String hoten = sc.nextLine();
        for (String item : list) {
            if (item.equals(hoten)) {
                list.remove(item);
                break;
            }

        }
        xuat();
    }

    public void hienthimenu() {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("cac chu nang cua chuong trinh : ");
            System.out.println("----------------------");
            System.out.println("1. nhap ho ten : ");
            System.out.println("2. hien thhi danh sach :");
            System.out.println("3. ho ten ngau nhien :");
            System.out.println("4. sap xep ho ten:");
            System.out.println("5. tim va xoa :");
            System.out.println("6. thoat chuong trinh:");
            System.out.println("-----------------------");
            System.out.println("lua chon cua ban la : ");
            int chon = s.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngaunhien();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    timvaxoa();
                    break;
                case 6:
                    System.exit(chon);
            }
        } while (true);
    }
}
