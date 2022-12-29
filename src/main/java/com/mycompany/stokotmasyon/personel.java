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
public class personel {
    private String isim;
    private String email;
    private String telefon;
    private String yetki_isim;
    private String TC;
    private int sifre;
   

    public personel() {
    }

    public personel(String isim, String email, String telefon, String yetki_isim, String TC, int sifre) {
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
        this.yetki_isim = yetki_isim;
        this.TC = TC;
        this.sifre = sifre;
       
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getYetki_isim() {
        return yetki_isim;
    }

    public void setYetki_isim(String yetki_isim) {
        this.yetki_isim = yetki_isim;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.isim);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.telefon);
        hash = 97 * hash + Objects.hashCode(this.yetki_isim);
        hash = 97 * hash + Objects.hashCode(this.TC);
        hash = 97 * hash + this.sifre;
        
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
        final personel other = (personel) obj;
        if (this.sifre != other.sifre) {
            return false;
        }
    
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefon, other.telefon)) {
            return false;
        }
        if (!Objects.equals(this.yetki_isim, other.yetki_isim)) {
            return false;
        }
        return Objects.equals(this.TC, other.TC);
    }

    @Override
    public String toString() {
        return "personel{" + "isim=" + isim + ", email=" + email + ", telefon=" + telefon + ", yetki_isim=" + yetki_isim + ", TC=" + TC + ", sifre=" + sifre + ", id=" + + '}';
    }

    
}
