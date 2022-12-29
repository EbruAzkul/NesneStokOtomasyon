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
public class islem {
  private String tip_isim; 
  private long id;
  private String ad;
  private int stok_sayisi;
  private float fiyat;

    public islem() {
    }

    public islem(String tip_isim, long id, String ad, int stok_sayisi, float fiyat) {
        this.tip_isim = tip_isim;
        this.id = id;
        this.ad = ad;
        this.stok_sayisi = stok_sayisi;
        this.fiyat = fiyat;
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



    public String getTip_isim() {
        return tip_isim;
    }

    public void setTip_isim(String tip_isim) {
        this.tip_isim = tip_isim;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tip_isim);
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final islem other = (islem) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.tip_isim, other.tip_isim);
    }

    @Override
    public String toString() {
        return "islem{" + "tip_isim=" + tip_isim + ", id=" + id + '}';
    }
 
  
}
