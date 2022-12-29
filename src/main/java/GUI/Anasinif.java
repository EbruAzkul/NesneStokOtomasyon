/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */

public   class Anasinif extends JFrame {
    JFrame window;
    
    JButton k_ekle;
    JButton k_sil;
    JButton m_ekle;
    JButton m_sil;
    JButton p_ekle;
    JButton p_sil;
    JButton s_degis;
    JButton satis;
    JButton u_ekle;
    JButton u_sil;
    JButton borc;
    JButton iade;
    JPanel newPanel;  

    public Anasinif() {
        window=new JFrame("Anasayfa");
        window.add(this.getK_ekle());
        window.add(this.getK_sil());
        window.add(this.getM_ekle());
        window.add(this.getM_sil());
        window.add(this.getP_ekle());
        window.add(this.getP_sil());
        window.add(this.getS_degis());
        window.add(this.getSatis());
        window.add(this.getU_ekle());
        window.add(this.getU_sil());
        window.add(this.getIade());
        window.add(this.getBorc());
        window.setSize(800, 800);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        k_ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new KullaniciEkle();
             

        }
        });
        
        k_sil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new KullanıcıSil();
             

        }
        });
        
        m_ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new MusteriEkle();
        }
        });
        
        m_sil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new MusteriSil();
        }
        });
        
        p_ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new PersonelEkle();
        }
        });
        
        p_sil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new PersonelSil();
        }
        });
        
        satis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new Satısekranı();
        }
        });
        
        s_degis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new SifreDegistir();
        }
        });
        
        u_ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new UrunEkle();
        }
        });
        
        u_sil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new UrunSil();
        }
        });
        
        borc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new borc_ode();
        }
        });
        
        iade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    new urun_iadesi();
        }
        });
                
       
     }
    public JButton getK_ekle() {
        this.setK_ekle();
        return k_ekle;
    }

    public void setK_ekle() {
        k_ekle =new JButton("KULLANICI EKLE");
        k_ekle.setBounds(120, 60,180, 40);
    }

    public JButton getK_sil() {
        this.setK_sil();
        return k_sil;
    }

    public void setK_sil() {
        k_sil =new JButton("KULLANICI SİL");
        k_sil.setBounds(120, 130, 180, 40);
    }

    public JButton getM_ekle() {
        this.setM_ekle();
        return m_ekle;
    }

    public void setM_ekle() {
        m_ekle =new JButton("MÜSTERİ EKLE");
        m_ekle.setBounds(120,200,180,40);
    }

    public JButton getM_sil() {
        this.setM_sil();
        return m_sil;
    }

    public void setM_sil() {
        m_sil =new JButton("MÜSTERİ SİL");
        m_sil.setBounds(120,270,180,40);
    }

    public JButton getP_ekle() {
        this.setP_ekle();
        return p_ekle;
    }

    public void setP_ekle() {
        p_ekle =new JButton("PERSONEL EKLE");
        p_ekle.setBounds(120,340,180,40);
    }

    public JButton getP_sil() {
        this.setP_sil();
        return p_sil;
    }
    public void setP_sil() {
         p_sil =new JButton("PERSONEL SİL");
         p_sil.setBounds(120,410,180,40);
    }
    
    
     public JButton getBorc() {
        this.setBorc();
         return borc;
    }

    public void setBorc() {
        borc=new JButton("BORÇ ÖDE");
        borc.setBounds(350,60,180,40);
    }
   

    public JButton getS_degis() {
        this.setS_degis();
        return s_degis;
    }

    public void setS_degis() {
        s_degis =new JButton("ŞİFRE DEĞİŞ");
        s_degis.setBounds(350,130,180,40);
    }

    public JButton getSatis() {
        this.setSatis();
        return satis;
    }

    public void setSatis() {
        satis =new JButton("SATIŞ");
        satis.setBounds(350,200,180,40);
    }

    public JButton getU_ekle() {
        this.setU_ekle();
        return u_ekle;
    }

    public void setU_ekle() {
       u_ekle=new JButton("ÜRÜN EKLE");
       u_ekle.setBounds(350,270,180,40);
    }

    public JButton getU_sil() {
        this.setU_sil();
        return u_sil;
    }

    public void setU_sil() {
        u_sil =new JButton("ÜRÜN SİL");
        u_sil.setBounds(350,340,180,40);
    }



    public JButton getIade() {
        this.setIade();
        return iade;
    }

    public void setIade() {
        iade=new JButton("ÜRÜN İADESİ");
        iade.setBounds(350,410,180,40);
    }

    
 
    
  
 
}


