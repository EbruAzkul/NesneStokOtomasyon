/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class MusteriSil implements IGui {
    JFrame window;
    JButton b1;
    JLabel userLabel, passLabel,userlabel1,userlabel2,userlabel3;
    JTextField textuser, textpassword,textuser1,textuser2,textuser3;
        public  MusteriSil () {
        window = new JFrame();
        userLabel = new JLabel("Müşteri Adı");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
        
        userlabel1 = new JLabel("Müşteri TC");
        userlabel1.setBounds(30, 70, 100, 20);

        textuser1= new JTextField(11);
        textuser1.setBounds(150, 70, 100, 20);
      
        userlabel2 = new JLabel("Kullanıcı Tel");
        userlabel2.setBounds(30, 110, 100, 20);

        textuser2= new JTextField(11);
        textuser2.setBounds(150, 110, 100, 20);
        
        userlabel3 = new JLabel("Müşteri Bakiye");
        userlabel3.setBounds(30, 150, 100, 20);

        textuser3= new JTextField(11);
        textuser3.setBounds(150, 150, 100, 20);
        
        
        passLabel = new JLabel("ŞİFRE");
        passLabel.setBounds(30, 190, 100, 20);

        textpassword = new JPasswordField(15);      
        textpassword.setBounds(150, 190, 100, 20);

        
        b1 = new JButton("MÜŞTERİYİ SİL ");   
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
