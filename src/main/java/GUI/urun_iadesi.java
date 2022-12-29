/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com.mycompany.stokotmasyon.borc_odeme;
import com.mycompany.stokotmasyon.iadeurun;
import controller.borc_controller;
import controller.iade_controller;
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
public class urun_iadesi {
    JFrame window;
    JButton b1;
    JLabel userLabel, passLabel;
    JTextField textuser, textpassword;
    
        public urun_iadesi() {
        window = new JFrame();
        userLabel = new JLabel("Ürün adı");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
      
        passLabel = new JLabel("İade ürün miktarı");
        passLabel.setBounds(30, 70, 100, 20);

        textpassword = new JTextField(11);      
          textpassword.setBounds(150, 70, 100, 20);

        //create submit button  
        b1 = new JButton("ÜRÜN İADESİ"); 
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
               iadeurun urun=new iadeurun();
               urun.setIade_ad(textuser.getText());
               urun.setIade_sayısı(Integer.parseInt(textpassword.getText()));
               new iade_controller(urun);               
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
