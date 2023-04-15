/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap9;

/**
 *
 * @author ASUS
 */
public class Sach extends TaiLieu {

    private String tentacgia;
    private int sotrang;

    public Sach(String tentacgia, int sotrang, String id, String tennxb, int soban) {
        super(id, tennxb, soban);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }

    public Sach() {
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return "Sach{" 
                + "tentacgia=" + tentacgia
                + ", sotrang=" + sotrang
                + ", id =" + this.getId()
                + ", tennhaxuatban=" + this.getTennxb()
                + ", soban=" + this.getSoban()
                + '}';
    }

}
