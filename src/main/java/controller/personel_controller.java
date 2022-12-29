/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.personel;
import data.FileAccessWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class personel_controller {
       FileAccessWriter fc;
    public personel_controller(personel personel){
        if(personel.getIsim().length()>5);
        else{
            System.out.println("Kullanici adi için karakter az");
            return;
        }   
        
         if(personel.getTC().length()>3);
        else{
            System.out.println("Kullanici tc si için karakter az");
            return;
        }
         
        if(personel.getTelefon().length()>3);
        else{
            System.out.println("Telefon için karakter az");
            return;
        }
        
        if(personel.getYetki_isim().length()>3);
        else{
            System.out.println("Yetki için karakter az");
            return;
        }
        if(personel.getSifre()!=0);
        else{
            System.out.println("Sifre 0 olamaz");
            return;
           
        }  
         fc=new FileAccessWriter();
        try {
            fc.kaydetpersonel(personel);
        } catch (IOException ex) {
            Logger.getLogger(Kullanici_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
           
}}
