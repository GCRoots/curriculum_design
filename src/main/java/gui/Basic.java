package gui;

import javax.swing.*;

/**
 * @author shipengfei
 * @data 19-12-27
 */
public class Basic {

    public static void main(String[] args) {
        Basic basic=new Basic();
        basic.Login();
    }

    public void Login() {
        JFrame jFrame=new JFrame("BASIC");

        jFrame.setDefaultLookAndFeelDecorated(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setBounds(600, 300, 500, 400);

        JPanel jPanel=new JPanel();
        jFrame.add(jPanel);

        JButton jButton=new JButton("Login");


        jPanel.add(jButton);


    }






}
