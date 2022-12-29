/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.borc_odeme;
import com.mycompany.stokotmasyon.urun;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class borc_controller {
      FileAccessWriter fc;
    public borc_controller(borc_odeme odeme){
        if(odeme.getBorc_miktar()>0);
        else{
            System.out.println("Borç ödemesi için borcunuz mevcut değildir");
            return;
        }   
             if(odeme.getIsim().length()>2);
        else{
            System.out.println("Müşteri  adi için karakter az");
            return;
        }  
         fc=new FileAccessWriter();
        try {
            fc.borcode(odeme);
        } catch (IOException ex) {
            Logger.getLogger(Stok_controller.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
}