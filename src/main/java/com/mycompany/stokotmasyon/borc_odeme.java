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
public class borc_odeme {
    private float borc_miktar;
    private String isim;
    private musteri_surekli musteri;

    public borc_odeme() {
    }

    public borc_odeme(float borc_miktar,String isim) {//composition(dependensty yani bağımlılık)ilişkisi mevcuttur
        musteri=new musteri_surekli();
        this.borc_miktar = borc_miktar;
        this.isim=isim;
        
    }

    public float getBorc_miktar() {
        return borc_miktar;
    }

    public void setBorc_miktar(float borc_miktar) {
        this.borc_miktar = borc_miktar;
    }

    public musteri_surekli getMusteri() {
        return musteri;
    }

    public void setMusteri(musteri_surekli musteri) {
        this.musteri = musteri;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "borc_odeme{" + "borc_miktar=" + borc_miktar + ", musteri=" + musteri + '}';
    }
    
    
}
