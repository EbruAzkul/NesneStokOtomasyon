/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.urun;
import controller.Kullanici_Controller;
import controller.Stok_controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class UrunEkle implements IGui{
       JFrame window;
    JButton b1;
    JLabel userLabel, passLabel,userlabel1,userlabel2,userlabel3;
    JTextField textuser, textuser4,textuser1,textuser2,textuser3;
        public UrunEkle() {
        window = new JFrame();
        userLabel = new JLabel("Ürün Adı");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
        
        userlabel1 = new JLabel("Ürün adet miktarı");
        userlabel1.setBounds(30, 70, 100, 20);

        textuser1= new JTextField(11);
        textuser1.setBounds(150, 70, 100, 20);
      
        userlabel2 = new JLabel("Ürün fiyatı");
        userlabel2.setBounds(30, 110, 100, 20);

        textuser2= new JTextField(11);
        textuser2.setBounds(150, 110, 100, 20);
        
        userlabel3 = new JLabel("Ürünün kategorisi");
        userlabel3.setBounds(30, 150, 100, 20);

        textuser3= new JTextField(11);
        textuser3.setBounds(150, 150, 100, 20);
        
        
        passLabel = new JLabel("Mevcut stok durumu");
        passLabel.setBounds(30, 190, 100, 20);

        textuser4 = new JTextField(11);      
        textuser4.setBounds(150, 190, 100, 20);

        
        b1 = new JButton("ÜRÜNÜ EKLE ");   
        b1.setBounds(150, 220, 180, 20);
        window.add(userLabel);
        window.add(textuser);
        window.add(userlabel1);
        window.add(textuser1);
        window.add(userlabel2);
        window.add(textuser2);
        window.add(userlabel3);
        window.add(textuser3);
        window.add(passLabel);
        window.add(textuser4);
        window.add(b1);
        window.setSize(500, 500);
        window.setLayout(null);
        window.setVisible(true);
        
        
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               urun urun=new urun();
               urun.setIsim(textuser.getText());
               urun.setKategori_isim(textuser3.getText());
               urun.setMevcutStok(textuser4.getText());
               urun.setAdet_miktari(Integer.parseInt(textuser1.getText()));
               urun.setFiyat(Integer.parseInt(textuser2.getText()));
               new Stok_controller(urun);               
            }
        });
        
        }
        
        public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {

        this.window = window;
    }

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

 

    public JLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(JLabel userLabel) {
        this.userLabel = userLabel;
    }

    public JLabel getPassLabel() {
        return passLabel;
    }

    public void setPassLabel(JLabel passLabel) {
        this.passLabel = passLabel;
    }

    public JTextField getTextField1() {
        return textuser;
    }

    public void setTextField1(JTextField textField1) {
        this.textuser = textField1;
    }

    public JTextField getTextField2() {
        return textuser4;
    }

    public void setTextField2(JTextField textField2) {
        this.textuser4= textField2;
    }
}
