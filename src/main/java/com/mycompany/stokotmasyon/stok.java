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
public class stok {
 private String s_kodu;
 private String s_ad;
 private int s_miktar;
 private float s_fiyat;
 private long id;
 private marka urun;//burada polymorphism ilişkisi mevcuttur 

    public stok() {
    }

    public stok(String s_kodu, String s_ad, int s_miktar, float s_fiyat, long id) {
         urun =new urun();//composition ilişkisi mevcuttur çünkü ürün olmadan stok oluşmaz 
        this.s_kodu = s_kodu;
        this.s_ad = s_ad;
        this.s_miktar = s_miktar;
        this.s_fiyat = s_fiyat;
        this.id = id;
    }

    public String getS_kodu() {
        return s_kodu;
    }

    public void setS_kodu(String s_kodu) {
        this.s_kodu = s_kodu;
    }

    public String getS_ad() {
        return s_ad;
    }

    public void setS_ad(String s_ad) {
        this.s_ad = s_ad;
    }

    public int getS_miktar() {
        return s_miktar;
    }

    public void setS_miktar(int s_miktar) {
        this.s_miktar = s_miktar;
    }

    public float getS_fiyat() {
        return s_fiyat;
    }

    public void setS_fiyat(float s_fiyat) {
        this.s_fiyat = s_fiyat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.s_kodu);
        hash = 59 * hash + Objects.hashCode(this.s_ad);
        hash = 59 * hash + this.s_miktar;
        hash = 59 * hash + Float.floatToIntBits(this.s_fiyat);
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final stok other = (stok) obj;
        if (this.s_miktar != other.s_miktar) {
            return false;
        }
        if (Float.floatToIntBits(this.s_fiyat) != Float.floatToIntBits(other.s_fiyat)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.s_kodu, other.s_kodu)) {
            return false;
        }
        return Objects.equals(this.s_ad, other.s_ad);
    }

    @Override
    public String toString() {
        return "stok{" + "s_kodu=" + s_kodu + ", s_ad=" + s_ad + ", s_miktar=" + s_miktar + ", s_fiyat=" + s_fiyat + ", id=" + id + '}';
    }
 
 
 
}
