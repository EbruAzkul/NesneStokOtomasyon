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
public class kategori {
  private String isim;
  private long id;  
  private urun k_urun;
    public kategori() {
    }

    public kategori(String isim, long id,urun urun) {
        k_urun=urun;//aggregetion ilişkisi mevcuttur kategori boş olabilir ama kategori oluşunu değiştirmez 
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
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
        hash = 29 * hash + Objects.hashCode(this.isim);
        hash = 29 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final kategori other = (kategori) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }

    @Override
    public String toString() {
        return "kategori{" + "isim=" + isim + ", id=" + id + '}';
    }
  
  
}
