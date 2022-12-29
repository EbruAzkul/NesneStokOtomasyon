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
public abstract class marka {//bu sınıftan nesne üretilemsine gerek yok amacı ürünü nitelendirmek ve polymorphismi sağlamak
   private String m_ad;
   private long id;

    public marka() {
    }

    public marka(String m_ad, long id) {
        this.m_ad = m_ad;
        this.id = id;
    }

    public String getM_ad() {
        return m_ad;
    }

    public void setM_ad(String m_ad) {
        this.m_ad = m_ad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.m_ad);
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final marka other = (marka) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.m_ad, other.m_ad);
    }

    @Override
    public String toString() {
        return "marka{" + "m_ad=" + m_ad + ", id=" + id + '}';
    }
   
}
