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
public class musteri_surekli {
   
   private String m_isim;
   private String m_tel;
   private int sifre;
   private String TC;
   private float m_bakiye;
   private float m_alacak;
   private float m_borc;

    public musteri_surekli() {
    }

    public musteri_surekli(String m_isim, String m_tel, int sifre, String TC, float m_bakiye, float m_alacak, float m_borc) {
        this.m_isim = m_isim;
        this.m_tel = m_tel;
        this.sifre = sifre;
        this.TC = TC;
        this.m_bakiye = m_bakiye;
       
        this.m_borc = m_borc;
    }

    public String getM_isim() {
        return m_isim;
    }

    public void setM_isim(String m_isim) {
        this.m_isim = m_isim;
    }

    public String getM_tel() {
        return m_tel;
    }

    public void setM_tel(String m_tel) {
        this.m_tel = m_tel;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public float getM_bakiye() {
        return m_bakiye;
    }

    public void setM_bakiye(float m_bakiye) {
        this.m_bakiye = m_bakiye;
    }



    public float getM_borc() {
        return m_borc;
    }

    public void setM_borc(float m_borc) {
        this.m_borc = m_borc;
    }

    @Override
    public String toString() {
        return "musteri_surekli{" + "m_isim=" + m_isim + ", m_tel=" + m_tel + ", sifre=" + sifre + ", TC=" + TC + ", m_bakiye=" + m_bakiye + ", m_alacak=" + m_alacak + ", m_borc=" + m_borc + '}';
    }
 
   
   

}