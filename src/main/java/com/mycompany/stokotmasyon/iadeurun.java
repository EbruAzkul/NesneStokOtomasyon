/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stokotmasyon;

/**
 *
 * @author Lenovo
 */
public class iadeurun extends urun {
    private String iade_ad;
    private int iade_sayısı;

    public iadeurun() {
    }

    public iadeurun(String iade_ad, int iade_sayısı) {
        this.iade_ad = iade_ad;
        this.iade_sayısı = iade_sayısı;
    }

    public iadeurun(String iade_ad, int iade_sayısı, String isim, int adet_miktari, int fiyat, String kategori_isim, long id) {
        super();
        this.iade_ad = iade_ad;
        this.iade_sayısı = iade_sayısı;
    }

    public String getIade_ad() {
        return iade_ad;
    }

    public void setIade_ad(String iade_ad) {
        this.iade_ad = iade_ad;
    }

    public int getIade_sayısı() {
        return iade_sayısı;
    }

    public void setIade_sayısı(int iade_sayısı) {
        this.iade_sayısı = iade_sayısı;
    }
    
    
}
