/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com.mycompany.stokotmasyon.islem;
import com.mycompany.stokotmasyon.personel;
import com.mycompany.stokotmasyon.satis;
import controller.Stok_controller;
import controller.personel_controller;
import controller.satis_controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Satısekranı implements IGui{

    JFrame window;
    JButton b1;
    JLabel userLabel, passLabel,userlabel2;
    JTextField textuser, textuser2,textuser3;
    
        public Satısekranı() {
        window = new JFrame();
        userLabel = new JLabel("ÜRÜN ADI ");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
      
        passLabel = new JLabel("GÜNCEL STOK SAYISI");
        passLabel.setBounds(30, 70, 100, 20);

        textuser2 = new JTextField(11);   
        textuser2.setBounds(150, 70, 100, 20);
        
        
        userlabel2 = new JLabel("FİYAT ");
        userlabel2.setBounds(30, 110, 100, 20);
        
        textuser3= new JTextField(11);
        textuser3.setBounds(150,110,100,20);

        
        b1 = new JButton("SATIŞ YAP");  
        b1.setBounds(150, 150, 180, 20);
        window.add(userLabel);
        window.add(textuser);
        window.add(passLabel);
        window.add(textuser2);
        window.add(userlabel2);
        window.add(textuser3);
        window.add(b1);
        window.setSize(500, 500);
        window.setLayout(null);
        window.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            satis satis =new satis();
                satis.setAd(textuser.getText());
                satis.setStok_sayisi(Integer.parseInt(textuser2.getText())); 
                satis.setFiyat(Float.parseFloat(textuser3.getText()));   
                satis_controller satis1 =new satis_controller();
                satis1.satıs_controller(satis);
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
        return textuser2;
    }

    public void setTextField2(JTextField textField2) {
        this.textuser2= textField2;
    }

    public JLabel getUserlabel2() {
        return userlabel2;
    }

    public void setUserlabel2(JLabel userlabel2) {
        this.userlabel2 = userlabel2;
    }

    public JTextField getTextuser3() {
        return textuser3;
    }

    public void setTextuser3(JTextField textuser3) {
        this.textuser3 = textuser3;
    }
    
    
}
