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
public class stok_arttır extends stok{
  private String stok_kodu;  
  private int stok_miktar;
  private int stok_birim;
  

    public stok_arttır() {
    }

    public stok_arttır(String stok_kodu, int stok_miktar, int stok_birim) {
        this.stok_kodu = stok_kodu;
        this.stok_miktar = stok_miktar;
        this.stok_birim = stok_birim;
    }

    public stok_arttır(String stok_kodu, int stok_miktar, int stok_birim, String s_kodu, String s_ad, int s_miktar, float s_fiyat, long id) {
        super(s_kodu, s_ad, s_miktar, s_fiyat, id);//Liskov Substition Solid prebsibi
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



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.stok_kodu);
        hash = 17 * hash + this.stok_miktar;
        hash = 17 * hash + this.stok_birim;
        
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
        final stok_arttır other = (stok_arttır) obj;
        if (this.stok_miktar != other.stok_miktar) {
            return false;
        }
        if (this.stok_birim != other.stok_birim) {
            return false;
        }
      
        return Objects.equals(this.stok_kodu, other.stok_kodu);
    }

    @Override
    public String toString() {
        return "stok_artt\u0131r{" + "stok_kodu=" + stok_kodu + ", stok_miktar=" + stok_miktar + ", stok_birim=" + stok_birim + ", id=" +  + '}';
    }
  
  
}
