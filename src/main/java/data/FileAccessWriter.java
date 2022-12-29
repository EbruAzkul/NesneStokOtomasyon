/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import com.mycompany.stokotmasyon.borc_odeme;
import com.mycompany.stokotmasyon.iadeurun;
import com.mycompany.stokotmasyon.islem;
import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.musteri_surekli;
import com.mycompany.stokotmasyon.personel;
import com.mycompany.stokotmasyon.satis;
import com.mycompany.stokotmasyon.urun;
import com.mycompany.stokotmasyon.yetki;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileAccessWriter {

    public FileAccessWriter() {
    }
    
    public void kaydet(kullanici kullanici ) throws IOException{ 
         BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\Kullanici.txt",true));
         String girdi= kullanici.getIsim()+" "+kullanici.getEmail()+" "+kullanici.getTelefon()+" " + kullanici.getYetki_isim()+" "+ Integer.toString(kullanici.getSifre()) + "\n";
         file.write(girdi);
         file.close();
    }
    
        
    public void sil(kullanici kullanici ) throws IOException{ 
         BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\Kullanici.txt",true));
         String silindi= kullanici.getIsim()+" "+ Integer.toString(kullanici.getSifre()) + "\n";
         file.write(silindi);
         file.close();
    }
    
        public void kaydetmusteri(musteri_surekli musteri ) throws IOException{ 
         BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\Musteri.txt",true));
         String girdi= musteri.getM_isim()+" "+musteri.getM_tel()+musteri.getTC()+" "+Float.toString(musteri.getM_bakiye())+Float.toString(musteri.getM_borc())+" "+ Integer.toString(musteri.getSifre()) + "\n";
         file.write(girdi);
         file.close();
    }
        
        public void kaydetpersonel(personel personel ) throws IOException{ 
        BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\Personel.txt",true));
         String girdi= personel.getIsim()+personel.getTC()+" "+personel.getTelefon()+" "+personel.getYetki_isim()+" "+ Integer.toString(personel.getSifre()) + "\n";
         file.write(girdi);
         file.close();
    }
        
        public void kaydeturun(urun urun ) throws IOException{ 
        BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\Stok.txt",true));
         String girdi= urun.getIsim()+" "+urun.getKategori_isim()+" "+urun.getMevcutStok()+" "+Integer.toString(urun.getFiyat())+" "+ Integer.toString(urun.getAdet_miktari()) + "\n";
         file.write(girdi);
         file.close();
    }
        
        public void sifre_guncelle(yetki yetki ) throws IOException{ 
         BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\Guvenlik.txt",true));
         String girdi= yetki.getIsim()+" "+ Integer.toString(yetki.getSifre()) + "\n";
         file.write(girdi);
         file.close();
    }
        
        public void borcode(borc_odeme odeme ) throws IOException{ 
        BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\borc.txt",true));
         String girdi= odeme.getIsim()+" "+ Integer.toString((int) odeme.getBorc_miktar()) + "\n";
         file.write(girdi);
         file.close();
    }
        
       public void iade(iadeurun urun ) throws IOException{ 
        BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\iadeurun.txt",true));
         String girdi= urun.getIade_ad()+" "+ Integer.toString((int) urun.getIade_sayısı()) + "\n";
         file.write(girdi);
         file.close();
}
       
        public void satıs(satis satisyap ) throws IOException{ 
        BufferedWriter file=new BufferedWriter(new 
        FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\stokOtmasyon\\src\\main\\java\\Dosya\\satıs.txt",true));
         String girdi= satisyap.getAd()+" "+ Integer.toString((int)satisyap.getStok_sayisi())+" "+ Float.toString((float)satisyap.getFiyat()) + "\n";
         file.write(girdi);
         file.close();
}
}