/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap9;

/**
 *
 * @author ASUS
 */
public class bao extends TaiLieu {

    private int ngayphathanh;

    public bao() {
    }

    public bao(String id, String tennxb, int soban) {
        super(id, tennxb, soban);
    }

    public int getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(int ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    @Override
    public String toString() {
        return "bao{"
                + "ngayphathanh=" + ngayphathanh
                + ", id =" + this.getId()
                + ", tennhaxuatban=" + this.getTennxb()
                + ", soban=" + this.getSoban()
                + '}';
    }

}
