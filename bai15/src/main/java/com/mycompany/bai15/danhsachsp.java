/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class danhsachsp {

    ArrayList<sanpham> list = new ArrayList<>();

    public void nhap() {
        System.out.println("nhap danh sach san pham ");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.printf("ten san pham thu %d : ", i + 1);
            String sp = sc.nextLine();
            if (sp == null || sp.equals("")) {
                System.out.println("dung nhap danh sach");
                break;

            }
            System.out.println("gia san pham : ");
            int gia = sc.nextInt();
            list.add(new sanpham(sp, gia));
            sc.nextLine();
            i++;
        } while (true);
    }

    public void hienthi() {
        System.out.println("danh sach san phan");
        System.out.println("ten san pham || gia ");
        for (sanpham sp : list) {
            System.out.printf("%20s | %d \n", sp.getTensp(), sp.getGia());
        }
    }

    public void sapxep() {
        Collections.sort(list, (a, b) -> (b.getGia() - (a.getGia())));
        System.out.println("danh sach sau khi sap xep");
        hienthi();
    }

    public void timvaxoa() {
        System.out.println("nhap vao ten san pham can tim: ");
        Scanner sc = new Scanner(System.in);
        String tensp = sc.nextLine();
        sanpham found = null;
        for (sanpham sp : list) {
            if (sp.getTensp().equals(tensp)) {
                found = sp;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            System.out.println("xoa san pham thanh cong ");
            hienthi();
        } else {
            System.out.println("San pham khong ton tai ");
        }
    }
}
