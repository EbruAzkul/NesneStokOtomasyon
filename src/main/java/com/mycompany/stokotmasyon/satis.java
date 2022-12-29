/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stokotmasyon;

/**
 *
 * @author Lenovo
 */
public class satis {
  private String ad;
  private int stok_sayisi;
  private float fiyat;

    public satis(String ad, int stok_sayisi, float fiyat) {
        this.ad = ad;
        this.stok_sayisi = stok_sayisi;
        this.fiyat = fiyat;
    }

    public satis() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getStok_sayisi() {
        return stok_sayisi;
    }

    public void setStok_sayisi(int stok_sayisi) {
        this.stok_sayisi = stok_sayisi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }
  
  
}
