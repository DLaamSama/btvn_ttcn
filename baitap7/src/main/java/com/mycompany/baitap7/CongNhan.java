/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap7;

/**
 *
 * @author ASUS
 */
public class CongNhan extends CanBo {

    private int bac;

    public CongNhan( String hoten, String gioitinh, String diachi, int tuoi,int bac) {
        super(hoten, gioitinh, diachi, tuoi);
        this.bac = bac;
    }

    public CongNhan() {

    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" 
                + "ho ten: " + this.getHoten()
                + "gioi tinh: " + this.getGioitinh()
                + "dia chi: " + this.getDiachi()
                + "tuoi: " + this.getTuoi()
                + "bac=" + bac
                + '}';
    }

}
