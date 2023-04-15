/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap9;

/**
 *
 * @author ASUS
 */
public class TapChi extends TaiLieu {

    private int sophathanh;
    private int thangphathanh;

    public TapChi() {
    }

    public TapChi(int sophathanh, int thangphathanh, String id, String tennxb, int soban) {
        super(id, tennxb, soban);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    @Override
    public String toString() {
        return "TapChi{"
                + "sophathanh=" + sophathanh
                + ", thangphathanh=" + thangphathanh
                + ", id =" + this.getId()
                + ", tennhaxuatban=" + this.getTennxb()
                + ", soban=" + this.getSoban()
                + '}';
    }

}
