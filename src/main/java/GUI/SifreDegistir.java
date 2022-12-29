/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com.mycompany.stokotmasyon.kullanici;
import com.mycompany.stokotmasyon.yetki;
import controller.Kullanici_Controller;
import controller.guvenlik_controller;
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
public class SifreDegistir {
      JFrame window;
    JButton b1;
    JLabel userLabel, passLabel;
    JTextField textuser, textpassword;
    
        public SifreDegistir() {
        window = new JFrame();
        userLabel = new JLabel("Mevcut şifre");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
      
        passLabel = new JLabel("Yeni Şifre");
        passLabel.setBounds(30, 70, 100, 20);

        textpassword = new JPasswordField(15);    //set length for the password  
          textpassword.setBounds(150, 70, 100, 20);

        //create submit button  
        b1 = new JButton("GÜNCELLE"); //set label to button  
        b1.setBounds(150, 110, 180, 20);
        window.add(userLabel);
        window.add(textuser);
        window.add(passLabel);
        window.add(textpassword);
        window.add(b1);

        window.setSize(500, 500);
        window.setLayout(null);
        window.setVisible(true);
        
            b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               yetki yetki=new yetki();
               yetki.setIsim(textuser.getText());
               yetki.setSifre(Integer.parseInt(textpassword.getText()));
               new guvenlik_controller(yetki);               
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
        return textpassword;
    }

    public void setTextField2(JTextField textField2) {
        this.textpassword= textField2;
    }
}
