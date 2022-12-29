/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stokotmasyon;

import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class urun extends marka{
   private String isim;
   private int adet_miktari;
   private int fiyat;
   private String kategori_isim;
   private String mevcutStok;
  

    public urun() {
    }

    public urun(String isim, int adet_miktari, int fiyat, String kategori_isim,String mevcutStok) {
        super();
        this.isim = isim;
        this.adet_miktari = adet_miktari;
        this.fiyat = fiyat;
        this.kategori_isim = kategori_isim;
        this.mevcutStok=mevcutStok;
            
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getAdet_miktari() {
        return adet_miktari;
    }

    public void setAdet_miktari(int adet_miktari) {
        this.adet_miktari = adet_miktari;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getKategori_isim() {
        return kategori_isim;
    }

    public void setKategori_isim(String kategori_isim) {
        this.kategori_isim = kategori_isim;
    }

    public String getMevcutStok() {
        return mevcutStok;
    }

    public void setMevcutStok(String mevcutStok) {
        this.mevcutStok = mevcutStok;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.isim);
        hash = 97 * hash + this.adet_miktari;
        hash = 97 * hash + this.fiyat;
        hash = 97 * hash + Objects.hashCode(this.kategori_isim);
       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final urun other = (urun) obj;
        if (this.adet_miktari != other.adet_miktari) {
            return false;
        }
        if (this.fiyat != other.fiyat) {
            return false;
        }
        
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return Objects.equals(this.kategori_isim, other.kategori_isim);
    }

    @Override
    public String toString() {
        return "urun{" + "isim=" + isim + ", adet_miktari=" + adet_miktari + ", fiyat=" + fiyat + ", kategori_isim=" + kategori_isim + ", id=" + + '}';
    }
   
}
