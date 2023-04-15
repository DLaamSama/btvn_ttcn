/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap9;

/**
 *
 * @author ASUS
 */
public class TaiLieu {
    private String id,tennxb;
    private int soban;

    public TaiLieu(String id, String tennxb, int soban) {
        this.id = id;
        this.tennxb = tennxb;
        this.soban = soban;
    }

    public TaiLieu() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public int getSoban() {
        return soban;
    }

    public void setSoban(int soban) {
        this.soban = soban;
    }
    
}
