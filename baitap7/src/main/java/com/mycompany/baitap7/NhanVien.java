/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap7;

/**
 *
 * @author ASUS
 */
public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien( String hoten, String gioitinh, String diachi, int tuoi,String congviec) {
        super(hoten, gioitinh, diachi, tuoi);
        this.congviec = congviec;
    }

    public NhanVien() {
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien{"
                +"ho ten: "+this.getHoten()
                +"gioi tinh: "+this.getGioitinh()
                +"dia chi: "+this.getDiachi()
                +"tuoi: "+this.getTuoi()
                 + "congviec:" + congviec
                + '}';
    }
    
}
