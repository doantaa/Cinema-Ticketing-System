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


    /**
     * Creates new form Home
     */
    public Home(Employee employee) {
        initComponents();

        this.employee = employee;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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










        //SAMPE SINI AJA YA



//        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
//        mainPanel.setLayout(mainPanelLayout);
//        mainPanelLayout.setHorizontalGroup(
//                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                .addGap(20, 20, 20)
//                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
//                                .addGap(12, 12, 12)
//                                .addComponent(jLabel8)
//                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addComponent(jLabel9)
//                                .addGap(60, 60, 60))
//                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                .addGap(69, 69, 69)
//                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                                .addComponent(cinemaCombo, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
//                                                .addGap(18, 18, 18)
//                                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
//                                                .addGap(18, 18, 18)
//                                                .addComponent(jLabel4)
//                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                                                .addComponent(avseatsnum, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
//                                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
//                                                .addGap(18, 18, 18)
//                                                .addComponent(scheduleLabel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
//                                .addContainerGap(88, Short.MAX_VALUE))
//                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
//                                .addGap(165, 165, 165)
//                                .addComponent(jLabel7)
//                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addComponent(scheduleLabel0)
//                                .addGap(23, 23, 23))
//                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
//                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap())
//        );
//        mainPanelLayout.setVerticalGroup(
//                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                                .addGap(31, 31, 31)
//                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                                        .addComponent(jLabel8)
//                                                        .addComponent(jLabel9))
//                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                                        .addComponent(jLabel7)
//                                                        .addComponent(scheduleLabel0)))
//                                        .addComponent(jLabel6))
//                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                                .addGap(73, 73, 73)
//                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
//                                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
//                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                                                .addComponent(scheduleLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
//                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                                .addGap(14, 14, 14)
//                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                                        .addComponent(jLabel4)
//                                                        .addComponent(avseatsnum, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
//                                        .addGroup(mainPanelLayout.createSequentialGroup()
//                                                .addGap(18, 18, 18)
//                                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                                                        .addComponent(cinemaCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
//                                .addGap(18, 18, 18)
//                                .addComponent(jButton1)
//                                .addContainerGap(101, Short.MAX_VALUE))
//        );
//
//        setJMenuBar(jMenuBar1);
//
//        GroupLayout layout = new GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//        );
//
//        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleComboActionPerformed(ActionEvent actionEvent) {
    }

    private void cinemaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinemaComboActionPerformed

//This takes the moivie names from the array list moviesArrayList

    }//GEN-LAST:event_cinemaComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        movieindex =  cinemaCombo.getSelectedIndex();
        partyindex = jComboBox2.getSelectedIndex();
        new Seat(movieindex, partyindex, employee).setVisible(true);
        avseatsnum.setText(""+cinema.hall(movieindex).party(partyindex).countAvSeats());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        avseatsnum.setText(""+cinema.hall(cinemaCombo.getSelectedIndex()).party(jComboBox2.getSelectedIndex()).countAvSeats());

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void avseatsnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avseatsnumActionPerformed
        avseatsnum.setText(""+cinema.hall(cinemaCombo.getSelectedIndex()).party(jComboBox2.getSelectedIndex()).countAvSeats());
    }//GEN-LAST:event_avseatsnumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables

    private JLabel upperTitleLabel;
    private JLabel lowerTitleLabel;

    private JLabel titleLabel;

}
