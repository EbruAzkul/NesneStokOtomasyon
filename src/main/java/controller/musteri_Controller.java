/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.musteri_surekli;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class musteri_Controller {
      FileAccessWriter fc;
    public musteri_Controller(musteri_surekli müsteri){
        if(müsteri.getM_isim().length()>5);
        else{
            System.out.println("müşteri adi için karakter az");
            return;
        } 
        if(müsteri.getM_tel().length()>3);
        else{
            System.out.println(" telefon için karakter az");
        }
        
        if(müsteri.getTC().length()>3);
        else{
            System.out.println(" TC için karakter az");
        }
        
        if(müsteri.getM_borc()>0);
        else{
            System.out.println("borcunuz bulunmamaktadır");
            return;   
        }
        
        if(müsteri.getM_bakiye()>0);
        else{
            System.out.println("Bakiyeniz bulunmamaktadır");
            return;   
        }

        if(müsteri.getSifre()!=0);
        else{
            System.out.println("Sifre 0 olamaz");
            return;
           
        } 
        
        
         fc=new FileAccessWriter();
        try {
            fc.kaydetmusteri(müsteri);
        } catch (IOException ex) {
            Logger.getLogger(musteri_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
}

