/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai15;

/**
 *
 * @author ASUS
 */
public class sanpham {
    private String tensp;
    private int gia;

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public sanpham() {
        this.tensp =null;
        this.gia = 0;
    }

    public sanpham(String tensp, int gia) {
        this.tensp = tensp;
        this.gia = gia;
    }
    
    
}
