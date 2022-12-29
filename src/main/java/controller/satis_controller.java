/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.islem;
import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.satis;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class satis_controller {
        FileAccessWriter fc;

  
    public void satıs_controller(satis satisyap){
        if(satisyap.getAd().length()>3);
        else{
            System.out.println("Müşteri adi için karakter az");
            return;
        } 
        if(satisyap.getFiyat()!=0);
        else{
            System.out.println("Fiyat sıfır olamaz");
            return;
           
        } 
        
               
        if(satisyap.getStok_sayisi()!=0);
        else{
            System.out.println("Stok bulunmamaktadır");
            return;
           
        } 
        
         fc=new FileAccessWriter();
        try {
            fc.satıs(satisyap);
        } catch (IOException ex) {
            Logger.getLogger(Kullanici_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}}
