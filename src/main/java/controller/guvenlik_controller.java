/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.yetki;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class guvenlik_controller {
        FileAccessWriter fc;
    public guvenlik_controller(yetki yetki){
        if(yetki.getIsim().length()>3);
        else{
            System.out.println("Şifre  için karakter az");
            return;
        }   
        if(yetki.getSifre()!=0);
        else{
            System.out.println("Sifre 0 olamaz");
            return;
           
        }  
         fc=new FileAccessWriter();
        try {
            fc.sifre_guncelle(yetki);
        } catch (IOException ex) {
            Logger.getLogger(Kullanici_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
          
}
}