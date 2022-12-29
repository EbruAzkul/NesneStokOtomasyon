/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import com.mycompany.stokotmasyon.StokOtmasyon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class girispanel {
    private String adminname="Ebru";
    private String adminpassword="ebru44";

    JFrame window;
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    JTextField textuser, textpassword;

    public girispanel() {
        window = new JFrame();
        userLabel = new JLabel("Kullanıcı Adı");
        userLabel.setBounds(30, 30, 100, 20);

        textuser= new JTextField(11);
        textuser.setBounds(150, 30, 100, 20);
      
        passLabel = new JLabel("ŞİFRE");
        passLabel.setBounds(30, 70, 100, 20);

        textpassword = new JPasswordField(15);    //set length for the password  
          textpassword.setBounds(150, 70, 100, 20);

        //create submit button  
        b1 = new JButton("GİRİŞ"); //set label to button  
        b1.setBounds(150, 110, 130, 20);
        window.add(userLabel);
        window.add(textuser);
        window.add(passLabel);
        window.add(textpassword);
        window.add(b1);

        window.setSize(500, 500);
        window.setLayout(null);
        window.setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textuser.getText().equals(adminname) && textpassword.getText().equals(adminpassword)) {
                    new Anasinif();
                } else {
                    JOptionPane.showMessageDialog(null, "KULLANICI ADI VEYA ŞİFRE YANLIŞ OLABİLİR");

                }
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

    public JPanel getNewPanel() {
        return newPanel;
    }

    public void setNewPanel(JPanel newPanel) {
        this.newPanel = newPanel;
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
