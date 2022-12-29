/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.borc_odeme;
import com.mycompany.stokotmasyon.iadeurun;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class iade_controller {
          FileAccessWriter fc;
    public iade_controller(iadeurun urun){
        if(urun.getIade_sayısı()>0);
        else{
            System.out.println("iade edilecek ürün bulunmamaktadır");
            return;
        }   
             if(urun.getIade_ad().length()>2);
        else{
            System.out.println("Ürün adı için karakter az");
            return;
        }  
         fc=new FileAccessWriter();
        try {
            fc.iade(urun);
        } catch (IOException ex) {
            Logger.getLogger(Stok_controller.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
}