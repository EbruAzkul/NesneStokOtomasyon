/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stokotmasyon;

/**
 *
 * @author Lenovo
 */
public class stok_satis extends stok {
  private String stok_kodu;  
  private int stok_miktar;
  private int stok_birim;
 

    public stok_satis() {
    }

    public stok_satis(String stok_kodu, int stok_miktar, int stok_birim) {
        this.stok_kodu = stok_kodu;
        this.stok_miktar = stok_miktar;
        this.stok_birim = stok_birim;
    }

    public stok_satis(String stok_kodu, int stok_miktar, int stok_birim, String s_kodu, String s_ad, int s_miktar, float s_fiyat, long id) {
        super(s_kodu, s_ad, s_miktar, s_fiyat, id);//Liskov prensibi Solid ilkesi 
        this.stok_kodu = stok_kodu;
        this.stok_miktar = stok_miktar;
        this.stok_birim = stok_birim;
    }



    public String getStok_kodu() {
        return stok_kodu;
    }

    public void setStok_kodu(String stok_kodu) {
        this.stok_kodu = stok_kodu;
    }

    public int getStok_miktar() {
        return stok_miktar;
    }

    public void setStok_miktar(int stok_miktar) {
        this.stok_miktar = stok_miktar;
    }

    public int getStok_birim() {
        return stok_birim;
    }

    public void setStok_birim(int stok_birim) {
        this.stok_birim = stok_birim;
    }


   
}
