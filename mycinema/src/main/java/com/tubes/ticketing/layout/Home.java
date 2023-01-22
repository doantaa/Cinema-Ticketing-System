/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tubes.ticketing.layout;

import com.tubes.ticketing.App;
import com.tubes.ticketing.Cinema;
import com.tubes.ticketing.Employee;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;



public class Home extends JFrame {
    private Cinema cinema = App.c1;
    Employee employee;
    public int movieindex,partyindex;
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
        scheduleCombo = new JComboBox<>();
        jButton1 = new JButton();
        avseatsnum = new JButton();
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
        backPanel = new JPanel();
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

        scheduleCombo.setBackground(new java.awt.Color(239, 239, 239));
        scheduleCombo.setMaximumRowCount(5);
        scheduleCombo.setBounds(262,197,161,21);
        scheduleCombo.setFont(poppinsMedium.deriveFont(12f));
        scheduleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(cinema.hall(movieindex).getParties()));
        scheduleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleComboActionPerformed(evt);
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
        homeFrame.add(scheduleCombo);
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
        partyindex = scheduleCombo.getSelectedIndex();
        new Seat(movieindex, partyindex, employee).setVisible(true);
        avseatsnum.setText(""+cinema.hall(movieindex).party(partyindex).countAvSeats());


    }

    private void scheduleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleComboActionPerformed

        avseatsnum.setText(""+cinema.hall(cinemaCombo.getSelectedIndex()).party(scheduleCombo.getSelectedIndex()).countAvSeats());

    }

    private void avseatsnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avseatsnumActionPerformed
        avseatsnum.setText(""+cinema.hall(cinemaCombo.getSelectedIndex()).party(scheduleCombo.getSelectedIndex()).countAvSeats());
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }


    private JButton avseatsnum;
    private JButton jButton1;
    private JComboBox<String> cinemaCombo;
    private JComboBox<String> scheduleCombo;
    private JLabel scheduleLabel;
    private JFrame homeFrame;
    private JLabel upperTitleLabel;
    private JLabel lowerTitleLabel;
    private JLabel titleLabel;
    private JPanel backPanel;

}
