/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.kullanici;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Kullanici_Controller {
    FileAccessWriter fc;
    public void Kullanıci(kullanici kullanici){
        if(kullanici.getIsim().length()>5);
        else{
            System.out.println("Kullanici adi için karakter az");
            return;
        } 
        
        if(kullanici.getEmail().length()>3);
        else{
          System.out.println("Kullanici maili  için karakter az");
          return;  
        }
        
        if(kullanici.getTelefon().length()>3);
        else{
          System.out.println("Kullanici telefon  için karakter az");
          return;  
        }
        
        if(kullanici.getYetki_isim().length()>3);
        else{
          System.out.println("Kullanici yetkisi  için karakter az");
          return;  
        }
                
       
        if(kullanici.getSifre()!=0);
        else{
            System.out.println("Sifre 0 olamaz");
            return;
           
        } 
        
         fc=new FileAccessWriter();
        try {
            fc.kaydet(kullanici);
        } catch (IOException ex) {
            Logger.getLogger(Kullanici_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   
        
    }
    
}
