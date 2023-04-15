/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class QuanLiTaiLieu {

    List<TaiLieu> quanlitailieu = new ArrayList<>();

    public void addtailieu(TaiLieu tailieu) {
        this.quanlitailieu.add(tailieu);

    }

    public boolean deletetailieu(String id) {
        TaiLieu tailieu = this.quanlitailieu.stream()
                .filter(quanlitailieu -> quanlitailieu.getId().equals(id))
                .findFirst().orElse(null);
        if (tailieu == null) {
            return false;
        }
        this.quanlitailieu.remove(tailieu);
        return true;

    }

    public void showinformation() {

        this.quanlitailieu.forEach(quanlitailieu -> System.out.println(quanlitailieu.toString()));
    }

    public void seachbysach() {
        this.quanlitailieu.stream().filter(doc -> doc instanceof Sach).forEach(doc -> System.out.println(doc.toString()));
    }

    public void seachbybao() {
        this.quanlitailieu.stream().filter(doc -> doc instanceof bao).forEach(doc -> System.out.println(doc.toString()));
    }

    public void seachbytapchi() {
        this.quanlitailieu.stream().filter(doc -> doc instanceof TapChi).forEach(doc -> System.out.println(doc.toString()));
    }

    void seachbysach() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
