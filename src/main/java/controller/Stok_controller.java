/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.urun;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Stok_controller {
    FileAccessWriter fc;
    public Stok_controller(urun urun){
        if(urun.getIsim().length()>2);
        else{
            System.out.println("Urun  adi için karakter az");
            return;
        }   
        
        if(urun.getKategori_isim().length()>2);
        else{
            System.out.println("Kategori adi için karakter az");
            return;
        }
        
        if(urun.getMevcutStok().length()>0);
        else{
            System.out.println("Stok için karakter az");
            return;
        }
        
        if(urun.getFiyat()!=0);
        else{
            System.out.println("Urun  adi için karakter az");
            return;
        }
        
        if(urun.getAdet_miktari()!=0);
        else{
            System.out.println("adet miktarı 0 olamaz");
            return;
           
        }  
         fc=new FileAccessWriter();
        try {
            fc.kaydeturun(urun);
        } catch (IOException ex) {
            Logger.getLogger(Stok_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
          
}}
