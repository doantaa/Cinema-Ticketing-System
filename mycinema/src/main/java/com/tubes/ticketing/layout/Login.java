/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tubes.ticketing.layout;

import com.tubes.ticketing.DataBase;
import com.tubes.ticketing.Employee;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Login extends JFrame {


    public Login() {
        initComponents();
    }
    Font poppinsBold;
    Font poppinsMedium;


    private void initComponents() {
        loginButton = new JButton();
        usernameField = new JTextField();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        passwordField = new JPasswordField();
        loginLabel = new JLabel();
        upperTitleLabel = new JLabel();
        lowerTitleLabel = new JLabel();
        JPanel backPanel = new JPanel();

        //setting jframe
        loginFrame = new JFrame("Login");
        loginFrame.setSize(600, 400);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLayout(null);
        loginFrame.setResizable(false);

        backPanel.setBackground(new Color(15,0,0));
        backPanel.setSize(600,400);

        // Font Configuration
        try{
            poppinsMedium = Font.createFont(Font.TRUETYPE_FONT, new File("mycinema/src/res/font/Poppins-Medium.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("mycinema/src/res/font/Poppins-Medium.ttf")));
        }
        catch (IOException | FontFormatException e){
            System.out.println(e.getMessage());
        }

        try{
            poppinsBold = Font.createFont(Font.TRUETYPE_FONT, new File("mycinema/src/res/font/Poppins-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("mycinema/src/res/font/Poppins-Bold.ttf")));
        }
        catch (IOException | FontFormatException e){
            System.out.println(e.getMessage());
        }

        loginButton.setText("Login");
        loginButton.addActionListener(evt -> loginButtonPerformed(evt));
        loginButton.setFont(poppinsMedium.deriveFont(16f));
        loginButton.setBounds(250,276,100,40);
        loginButton.setBackground(new Color(104,0,0));
        loginButton.setForeground(Color.WHITE);

        usernameLabel.setText("Username");
        usernameLabel.setBounds(177,181,73,21);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(poppinsMedium.deriveFont(14f));

        usernameField.setBounds(262,181,161,21);
        usernameField.setFont(poppinsMedium.deriveFont(12f));
        usernameField.setBorder(null);

        passwordLabel.setForeground(new Color(51, 51, 51));
        passwordLabel.setText("Password");
        passwordLabel.setBounds(177,213,73,21);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(poppinsMedium.deriveFont(14f));

        passwordField.setBounds(262,213,161,21);
        passwordField.setFont(poppinsBold.deriveFont(12f));
        passwordField.setBorder(null);

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassWordActionPerformed(evt);
            }
        });

        loginLabel.setText("");
        loginLabel.setBounds(200,320,300,21);
        loginLabel.setFont(poppinsMedium.deriveFont(12f));

        upperTitleLabel.setBounds(230,84,140,30);
        upperTitleLabel.setFont(poppinsBold.deriveFont(20f));
        upperTitleLabel.setText("MOVIE TICKET");
        upperTitleLabel.setForeground(Color.WHITE);

        lowerTitleLabel.setBounds(211,109,179,30);
        lowerTitleLabel.setFont(poppinsBold.deriveFont(20f));
        lowerTitleLabel.setText("BOOKING SYSTEM");
        lowerTitleLabel.setForeground(Color.WHITE);

        loginFrame.add(usernameLabel);
        loginFrame.add(usernameField);
        loginFrame.add(passwordLabel);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);
        loginFrame.add(loginLabel);
        loginFrame.add(upperTitleLabel);
        loginFrame.add(lowerTitleLabel);
        loginFrame.add(backPanel);
        loginFrame.setVisible(true);
    }

    private void loginButtonPerformed(java.awt.event.ActionEvent evt) {
        String login = new String(passwordField.getPassword());
        findMatch();
    }

    private void PassWordActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        new Login();
    }
    
    private void findMatch(){
        for (int i = 0; i < 5; i++){
            if(usernameField.getText().equals(DataBase.getQuery(i, "username")) && passwordField.getText().equals(DataBase.getQuery(i, "password"))){
                new Home(new Employee(DataBase.getQuery(i, "fname"), DataBase.getQuery(i, "username"), DataBase.getQuery(i, "email"), DataBase.getQuery(i, "password"))).setVisible(true);
                loginLabel.setText("Login Berhasil");
                loginFrame.dispose();
                break;
            }
        else{
          loginLabel.setText("username atau password salah");
                loginLabel.setForeground(Color.RED);
        }
        
        }
    }

    //Variabel Swing
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel loginLabel;
    private JLabel lowerTitleLabel;
    private JLabel upperTitleLabel;
    private JFrame loginFrame;

}
