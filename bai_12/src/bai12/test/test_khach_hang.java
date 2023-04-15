/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12.test;

import bai12.io.file_factory;
import bai12.model.khach_hang;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class test_khach_hang {
    public static void test_luu_file(){
        ArrayList<khach_hang> dskh = new ArrayList<>();
        dskh.add(new khach_hang( 12,"Phan Van Nguyen"));
        dskh.add(new khach_hang( 13,"Phan Van Kien"));
        dskh.add(new khach_hang( 14,"Phan Thi Trang"));
        dskh.add(new khach_hang( 15,"Phan Van Sau"));
        boolean kt  = file_factory.luu_file(dskh, "d:\\dulieu.text");
        if(kt ==true ){
            System.out.println("da luu file thanh cong ");              
        }else{
            System.out.println("luu file that bai");
        }
    }
    public static void main(String[] args) {
        test_luu_file();
    }
}
