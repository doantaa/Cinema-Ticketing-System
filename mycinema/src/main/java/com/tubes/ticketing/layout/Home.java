/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tubes.ticketing.layout;

import com.tubes.ticketing.App;
import com.tubes.ticketing.Cinema;
import com.tubes.ticketing.Employee;
import com.tubes.ticketing.Schedule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;



public class Home extends JFrame {
    private Cinema cinema = App.c1;
    Employee employee;
    String empName;
    public int movieindex;
    public int partyindex;
    Font poppinsMedium,poppinsBold;



    public Home(Employee employee) {
        initComponents();

        this.employee = employee;

    }



    private void initComponents() {

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

        cinemaCombo = new JComboBox<>();
        scheduleLabel = new JLabel();
        jLabel2 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jLabel4 = new JLabel();
        jLabel6 = new JLabel(new ImageIcon("logo.png"));
        jButton1 = new JButton();
        avseatsnum = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        scheduleLabel0 = new JLabel();
        upperTitleLabel = new JLabel();
        lowerTitleLabel = new JLabel();
        titleLabel = new JLabel();
        JLabel avseatLabel = new JLabel();


        upperTitleLabel.setBounds(230,84,140,30);
        upperTitleLabel.setFont(poppinsBold.deriveFont(20f));
        upperTitleLabel.setText("MOVIE TICKET");
        upperTitleLabel.setForeground(Color.WHITE);

        lowerTitleLabel.setBounds(211,109,179,30);
        lowerTitleLabel.setFont(poppinsBold.deriveFont(20f));
        lowerTitleLabel.setText("BOOKING SYSTEM");
        lowerTitleLabel.setForeground(Color.WHITE);

        homeFrame = new JFrame("Home - Select Your Ticket");
        homeFrame.setSize(600, 400);
        homeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setLayout(null);
        homeFrame.setResizable(false);
        JPanel backPanel = new JPanel();
        backPanel.setBackground(new Color(15,0,0));
        backPanel.setSize(600,400);



        titleLabel.setText("Movie Title");
        titleLabel.setBounds(176,165,100,21);
        titleLabel.setFont(poppinsMedium.deriveFont(14f));
        titleLabel.setForeground(Color.WHITE);


        cinemaCombo.setBackground(new java.awt.Color(239, 239, 239));
        cinemaCombo.setMaximumRowCount(5);
        cinemaCombo.setFont(poppinsMedium.deriveFont(12f));
        cinemaCombo.setModel(new DefaultComboBoxModel<>(cinema.getMovies()));
        cinemaCombo.addActionListener(this::cinemaComboActionPerformed);
        cinemaCombo.setBounds(262,165,161,21);
        cinemaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinemaComboActionPerformed(evt);
            }
        });


        scheduleLabel.setFont(poppinsMedium.deriveFont(14f)); // NOI18N
        scheduleLabel.setForeground(Color.WHITE);
        scheduleLabel.setText("Schedule");
        scheduleLabel.setBounds(176,197,66,21);

        jComboBox2.setBackground(new java.awt.Color(239, 239, 239));
        jComboBox2.setMaximumRowCount(5);
        jComboBox2.setBounds(262,197,161,21);
        jComboBox2.setFont(poppinsMedium.deriveFont(12f));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(cinema.hall(movieindex).getParties()));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        avseatLabel.setFont(poppinsMedium.deriveFont(14f)); // NOI18N
        avseatLabel.setForeground(Color.WHITE);
        avseatLabel.setText("Seat Avail");
        avseatLabel.setBounds(176,229,100,21);


        avseatsnum.setText("Click");
        avseatsnum.setBounds(296,229,127,21);
        avseatsnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avseatsnumActionPerformed(evt);
            }
        });

        jButton1.setText("Seats");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(196,276,208,39);
        jButton1.setBackground(new Color(104,0,0));
        jButton1.setForeground(Color.WHITE);

        homeFrame.add(cinemaCombo);
        homeFrame.add(jComboBox2);
        homeFrame.add(scheduleLabel);
        homeFrame.add(lowerTitleLabel);
        homeFrame.add(upperTitleLabel);
        homeFrame.add(titleLabel);
        homeFrame.add(avseatsnum);
        homeFrame.add(avseatLabel);
        homeFrame.add(jButton1);
        homeFrame.add(backPanel);

        homeFrame.setVisible(true);
    }










        //REHAT BENTAR




    private void cinemaComboActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        movieindex =  cinemaCombo.getSelectedIndex();
        partyindex = jComboBox2.getSelectedIndex();
        new Seat(movieindex, partyindex, employee).setVisible(true);
        avseatsnum.setText(""+cinema.hall(movieindex).party(partyindex).countAvSeats());


    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        avseatsnum.setText(""+cinema.hall(cinemaCombo.getSelectedIndex()).party(jComboBox2.getSelectedIndex()).countAvSeats());

    }

    private void avseatsnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avseatsnumActionPerformed
        avseatsnum.setText(""+cinema.hall(cinemaCombo.getSelectedIndex()).party(jComboBox2.getSelectedIndex()).countAvSeats());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }


    private JButton avseatsnum;
    private JButton jButton1;
    private JComboBox<String> cinemaCombo;
    private JComboBox<String> jComboBox2;
    private JLabel scheduleLabel;
    private JLabel scheduleLabel0;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JFrame homeFrame;


    private JLabel upperTitleLabel;
    private JLabel lowerTitleLabel;

    private JLabel titleLabel;

}
