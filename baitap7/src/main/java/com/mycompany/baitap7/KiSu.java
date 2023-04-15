/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap7;

/**
 *
 * @author ASUS
 */
public class KiSu extends CanBo {

    private String nghanhdaotao;

    public KiSu( String hoten, String gioitinh, String diachi, int tuoi,String nghanhdaotao) {
        super(hoten, gioitinh, diachi, tuoi);
        this.nghanhdaotao = nghanhdaotao;
    }

    public KiSu() {
    }

    public String getNghanhdaotao() {
        return nghanhdaotao;
    }

    public void setNghanhdaotao(String nghanhdaotao) {
        this.nghanhdaotao = nghanhdaotao;
    }

    @Override
    public String toString() {
        return "KiSu{" 
                + "ho ten: " + this.getHoten()
                + "gioi tinh: " + this.getGioitinh()
                + "dia chi: " + this.getDiachi()
                + "tuoi: " + this.getTuoi()
                + "nghanhdaotao=" + nghanhdaotao
                + '}';
    }

}
