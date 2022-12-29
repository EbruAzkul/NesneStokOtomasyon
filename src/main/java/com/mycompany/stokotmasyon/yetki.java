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
public class yetki {
  private String isim;
  private int sifre;
  private long id;
    public yetki() {
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public yetki(String isim, int sifre, long id) {
        this.isim = isim;
        this.sifre = sifre;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.isim);
        hash = 43 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final yetki other = (yetki) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }

    @Override
    public String toString() {
        return "yetki{" + "isim=" + isim + ", sifre=" + sifre + ", id=" + id + '}';
    }

  

 
    
    
}
