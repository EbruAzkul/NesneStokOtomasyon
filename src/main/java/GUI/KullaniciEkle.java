/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com.mycompany.stokotmasyon.kullanici;
import controller.Kullanici_Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class KullaniciEkle implements IGui {
    JFrame window;
    JButton b1;
    JLabel userLabel, passLabel,userlabel1,userlabel2,userlabel3;
    JTextField textuser, textpassword,textuser1,textuser2,textuser3;
        public KullaniciEkle() {
        window = new JFrame();
        userLabel = new JLabel("Kullanıcı Adı");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
        
        userlabel1 = new JLabel("Kullanıcı Email");
        userlabel1.setBounds(30, 70, 100, 20);

        textuser1= new JTextField(11);
        textuser1.setBounds(150, 70, 100, 20);
      
        userlabel2 = new JLabel("Kullanıcı Tel");
        userlabel2.setBounds(30, 110, 100, 20);

        textuser2= new JTextField(11);
        textuser2.setBounds(150, 110, 100, 20);
        
        userlabel3 = new JLabel("Kullanıcı yetkisi");
        userlabel3.setBounds(30, 150, 100, 20);

        textuser3= new JTextField(11);
        textuser3.setBounds(150, 150, 100, 20);
        
        
        passLabel = new JLabel("ŞİFRE");
        passLabel.setBounds(30, 190, 100, 20);

        textpassword = new JPasswordField(15);      
        textpassword.setBounds(150, 190, 100, 20);

        
        b1 = new JButton("KULLANICI OLUSTUR");   
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
        window.add(textpassword);
        window.add(b1);
        window.setSize(500, 500);
        window.setLayout(null);
        window.setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               kullanici kullanici=new kullanici();
               kullanici.setIsim(textuser.getText());
               kullanici.setEmail(textuser1.getText());
               kullanici.setTelefon(textuser2.getText());
               kullanici.setYetki_isim(textuser3.getText()); 
               kullanici.setSifre(Integer.parseInt(textpassword.getText()));
               Kullanici_Controller ku =new Kullanici_Controller();               
             ku.Kullanıci(kullanici);            }
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
        return textpassword;
    }

    public void setTextField2(JTextField textField2) {
        this.textpassword= textField2;
    }

    public JLabel getUserlabel1() {
        return userlabel1;
    }

    public void setUserlabel1(JLabel userlabel1) {
        this.userlabel1 = userlabel1;
    }

    public JLabel getUserlabel2() {
        return userlabel2;
    }

    public void setUserlabel2(JLabel userlabel2) {
        this.userlabel2 = userlabel2;
    }

    public JLabel getUserlabel3() {
        return userlabel3;
    }

    public void setUserlabel3(JLabel userlabel3) {
        this.userlabel3 = userlabel3;
    }

    public JTextField getTextuser() {
        return textuser;
    }

    public void setTextuser(JTextField textuser) {
        this.textuser = textuser;
    }

    public JTextField getTextpassword() {
        return textpassword;
    }

    public void setTextpassword(JTextField textpassword) {
        this.textpassword = textpassword;
    }

    public JTextField getTextuser1() {
        return textuser1;
    }

    public void setTextuser1(JTextField textuser1) {
        this.textuser1 = textuser1;
    }

    public JTextField getTextuser2() {
        return textuser2;
    }

    public void setTextuser2(JTextField textuser2) {
        this.textuser2 = textuser2;
    }

    public JTextField getTextuser3() {
        return textuser3;
    }

    public void setTextuser3(JTextField textuser3) {
        this.textuser3 = textuser3;
    }

 
    
}

