/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12.io;

import bai12.model.khach_hang;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class file_factory {
    public static boolean luu_file(ArrayList<khach_hang>dskh,String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for(khach_hang kh : dskh){
                String line = kh.getMa()+ ";"+kh.getTen();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<khach_hang> docFile(String path) {
        ArrayList<khach_hang> dsKH = new ArrayList<khach_hang>();
        try{
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return dsKH;
    }
    
}
