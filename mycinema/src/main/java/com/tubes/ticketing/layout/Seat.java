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


public class Seat extends JFrame {
    private final Cinema cinema = App.c1;
    private final int movieindex;
    private final int partyindex;
    private final Employee employee;
    Font poppinsMedium, poppinsBold;


    /**
     * Creates new form SeatLight
     */
    public Seat(int movieindex, int partyindex, Employee employee) {
        initComponents();
        this.movieindex = movieindex;
        this.partyindex = partyindex;
        keepSeatsUpdated();
        moviename.setText(cinema.hall(movieindex).getMovie().getTitle());
        partydetail.setText(cinema.hall(movieindex).party(partyindex).toString());
        this.employee = employee;
        
    }


    private void initComponents() {
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

        jPanel9 = new JPanel();
        jPanel21 = new JPanel();
        b29 = new JCheckBox();
        b28 = new JCheckBox();
        jPanel6 = new JPanel();
        c1 = new JCheckBox();
        c3 = new JCheckBox();
        c2 = new JCheckBox();
        c0 = new JCheckBox();
        jPanel16 = new JPanel();
        a9 = new JCheckBox();
        a8 = new JCheckBox();
        jPanel22 = new JPanel();
        c9 = new JCheckBox();
        c8 = new JCheckBox();
        jPanel14 = new JPanel();
        b17 = new JCheckBox();
        b23 = new JCheckBox();
        b22 = new JCheckBox();
        b16 = new JCheckBox();
        jPanel12 = new JPanel();
        b15 = new JCheckBox();
        b21 = new JCheckBox();
        b20 = new JCheckBox();
        b14 = new JCheckBox();
        jPanel10 = new JPanel();
        b13 = new JCheckBox();
        b19 = new JCheckBox();
        b18 = new JCheckBox();
        b12 = new JCheckBox();
        jPanel4 = new JPanel();
        c5 = new JCheckBox();
        c7 = new JCheckBox();
        c6 = new JCheckBox();
        c4 = new JCheckBox();
        jPanel17 = new JPanel();
        b25 = new JCheckBox();
        b24 = new JCheckBox();
        jPanel18 = new JPanel();
        b27 = new JCheckBox();
        b26 = new JCheckBox();
        jPanel15 = new JPanel();
        b5 = new JCheckBox();
        b11 = new JCheckBox();
        b10 = new JCheckBox();
        b4 = new JCheckBox();
        jPanel13 = new JPanel();
        b3 = new JCheckBox();
        b9 = new JCheckBox();
        b8 = new JCheckBox();
        b2 = new JCheckBox();
        jPanel11 = new JPanel();
        b1 = new JCheckBox();
        b7 = new JCheckBox();
        b6 = new JCheckBox();
        b0 = new JCheckBox();
        jPanel3 = new JPanel();
        a5 = new JCheckBox();
        a7 = new JCheckBox();
        a6 = new JCheckBox();
        a4 = new JCheckBox();
        jPanel5 = new JPanel();
        a1 = new JCheckBox();
        a3 = new JCheckBox();
        a2 = new JCheckBox();
        a0 = new JCheckBox();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        moviename = new JLabel();
        partydetail = new JLabel();
        jMenuBar1 = new JMenuBar();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seats");
        setResizable(false);
        setLocationRelativeTo(null);

        jPanel9.setBackground(new java.awt.Color(200, 204, 212));

        jPanel21.setBackground(new java.awt.Color(200, 204, 212));

        b29.setText("29");
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        b29.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 29).state());

        b28.setText("28");
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        b28.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 28).state());

        GroupLayout jPanel21Layout = new GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(b28, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b29, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b29, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b28, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(200, 204, 212));

        c1.setText("1");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        c1.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 1).state());

        c3.setText("3");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        c3.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 3).state());

        c2.setText("2");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        c2.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 2).state());

        c0.setText("0");
        c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0ActionPerformed(evt);
            }
        });
        c0.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 0).state());

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(c0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(c2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(c1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(c3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel16.setBackground(new java.awt.Color(200, 204, 212));

        a9.setText("9");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });
        a9.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 9).state());

        a8.setText("8");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        a8.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 8).state());

        GroupLayout jPanel16Layout = new GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(a8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(a9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(200, 204, 212));

        c9.setText("9");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        c9.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 9).state());

        c8.setText("8");
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        c8.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 8).state());

        GroupLayout jPanel22Layout = new GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(c8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(c9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(200, 204, 212));

        b17.setText("17");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        b17.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 17).state());

        b23.setText("23");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        b23.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 23).state());

        b22.setText("22");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        b22.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 22).state());

        b16.setText("16");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        b16.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 16).state());

        GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(b16, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b17, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(b22, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b23, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b17, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b23, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(200, 204, 212));

        b15.setText("15");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        b15.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 15).state());

        b21.setText("21");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        b21.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 21).state());

        b20.setText("20");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        b20.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 20).state());

        b14.setText("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        b14.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 14).state());

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(b14, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b15, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(b20, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b21, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b15, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b21, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b20, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(200, 204, 212));

        b13.setText("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        b13.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 13).state());

        b19.setText("19");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        b19.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 19).state());

        b18.setText("18");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        b18.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 18).state());

        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        b12.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 12).state());

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(b12, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b13, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(b18, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b19, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b13, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b19, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b18, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(200, 204, 212));

        c5.setText("5");
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        c5.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 5).state());

        c7.setText("7");
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        c7.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 7).state());

        c6.setText("6");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        c6.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 6).state());

        c4.setText("4");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        c4.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 4).state());

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(c4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(c6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(c5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(c7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel17.setBackground(new java.awt.Color(200, 204, 212));

        b25.setText("25");
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        b25.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 25).state());

        b24.setText("24");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        b24.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 24).state());

        GroupLayout jPanel17Layout = new GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(b24, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b25, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b25, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b24, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel18.setBackground(new java.awt.Color(200, 204, 212));

        b27.setText("27");
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        b27.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 27).state());

        b26.setText("26");
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        b26.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 26).state());

        GroupLayout jPanel18Layout = new GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(b26, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b27, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b27, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b26, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel15.setBackground(new java.awt.Color(200, 204, 212));

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 5).state());

        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        b11.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 11).state());

        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        b10.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 10).state());

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 4).state());

        GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(b4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(b10, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b11, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b11, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel13.setBackground(new java.awt.Color(200, 204, 212));

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 3).state());

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        b9.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 9).state());

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        b8.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 8).state());

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 2).state());

        GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(b2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(b8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b9, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel11.setBackground(new java.awt.Color(200, 204, 212));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 1).state());

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 7).state());

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        b6.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 6).state());

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        b0.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 0).state());

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(b0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(b7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(200, 204, 212));

        a5.setText("5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        a5.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 5).state());

        a7.setText("7");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        a7.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 7).state());

        a6.setText("6");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        a6.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 6).state());

        a4.setText("4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        a4.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 4).state());

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(a4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(a6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(a5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(a7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(200, 204, 212));

        a1.setText("1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        a1.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 1).state());

        a3.setText("3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        a3.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 3).state());

        a2.setText("2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        a2.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 2).state());

        a0.setText("0");
        a0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a0ActionPerformed(evt);
            }
        });
        a0.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 0).state());

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(a0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(a2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(a3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(a1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(a0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(a3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("C");

        moviename.setText(cinema.hall(movieindex).getMovie().getTitle());

        partydetail.setText(cinema.hall(movieindex).party(partyindex).toString());

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(73, 73, 73))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(moviename)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(partydetail)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moviename)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partydetail)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void a0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a0ActionPerformed
        chkbxAction(a0, 'A', 0);

    }//GEN-LAST:event_a0ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        chkbxAction(a2, 'A', 2);      // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        chkbxAction(a1, 'A', 1);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
              chkbxAction(a3, 'A',3);        // TODO add your handling code here:
  // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        chkbxAction(a4, 'A', 4);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
              chkbxAction(a5, 'A', 5);        // TODO add your handling code here:
  // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        chkbxAction(a6, 'A', 6);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        chkbxAction(a7, 'A',7);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        chkbxAction(a8, 'A',8);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        chkbxAction(a9, 'A',9);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_a9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        chkbxAction(b0, 'B', 0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        chkbxAction(b1, 'B', 1);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        chkbxAction(b6, 'B', 6);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        chkbxAction(b7, 'B', 7);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        chkbxAction(b12, 'B', 12);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        chkbxAction(b13, 'B',13);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        chkbxAction(b18, 'B', 18);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        chkbxAction(b19, 'B', 19);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b19ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        chkbxAction(b24, 'B', 24);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        chkbxAction(b25, 'B', 25);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b25ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        chkbxAction(b2, 'B', 2);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        chkbxAction(b3, 'B', 3);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        chkbxAction(b8, 'B', 8);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        chkbxAction(b9, 'B', 9);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        chkbxAction(b14, 'B', 14);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        chkbxAction(b15, 'B', 15);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b15ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        chkbxAction(b20, 'B', 20);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        chkbxAction(b21, 'B', 21);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        chkbxAction(b26, 'B', 26);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b26ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        chkbxAction(b27, 'B', 27);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b27ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        chkbxAction(b4, 'B', 4);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        chkbxAction(b5, 'B', 5);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        chkbxAction(b10, 'B', 10);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        chkbxAction(b11, 'B', 11);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        chkbxAction(b16, 'B', 16);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        chkbxAction(b17, 'B', 17);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        chkbxAction(b22, 'B', 22);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        chkbxAction(b23, 'B', 23);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b23ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        chkbxAction(b28, 'B', 28);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b28ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        chkbxAction(b29, 'B', 29);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b29ActionPerformed

    private void c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0ActionPerformed
        chkbxAction(c0, 'C', 0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c0ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        chkbxAction(c1, 'C', 1);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        chkbxAction(c2, 'C', 2);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        chkbxAction(c3, 'C', 3);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        chkbxAction(c4, 'C', 4);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        chkbxAction(c5, 'C', 5);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        chkbxAction(c6, 'C', 6);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        chkbxAction(c7, 'C', 7);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        chkbxAction(c8, 'C', 8);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
        chkbxAction(c9, 'C', 9);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_c9ActionPerformed

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
            java.util.logging.Logger.getLogger(Seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        //     public void run() {
        //         new SeatLight().setVisible(true);
        //     }
        // });
    }
    
    private void select(JCheckBox chkbx){
        chkbx.setForeground(Color.red);
        
    }
    private void deselect(JCheckBox chkbx){
        chkbx.setForeground(Color.green);
    }
    
    private void chkbxAction(JCheckBox chkbx, char seatsec, int seatindex){
        if(chkbx.isSelected()){
           select(chkbx);
            new TicketPrint(movieindex, partyindex, seatsec, seatindex, employee).setVisible(true);
        }
        else{deselect(chkbx);}
    }
    
    private void keepSeatsUpdated(){
        //A
a0.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 0).state());
a1.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 1).state());
a2.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 2).state());
a3.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 3).state());
a4.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 4).state());
a5.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 5).state());
a6.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 6).state());
a7.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 7).state());
a8.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 8).state());
a9.setSelected(!cinema.hall(movieindex).party(partyindex).seat('A', 9).state());
// B
b0.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 0).state());
b1.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 1).state());
b2.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 2).state());
b3.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 3).state());
b4.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 4).state());
b5.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 5).state());
b6.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 6).state());
b7.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 7).state());
b8.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 8).state());
b9.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 9).state());
b10.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 10).state());
b11.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 11).state());
b12.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 12).state());
b13.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 13).state());
b14.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 14).state());
b15.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 15).state());
b16.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 16).state());
b17.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 17).state());
b18.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 18).state());
b19.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 19).state());
b20.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 20).state());
b21.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 21).state());
b22.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 22).state());
b23.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 23).state());
b24.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 24).state());
b25.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 25).state());
b26.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 26).state());
b27.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 27).state());
b28.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 28).state());
b29.setSelected(!cinema.hall(movieindex).party(partyindex).seat('B', 29).state());
// C
c0.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 0).state());
c1.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 1).state());
c2.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 2).state());
c3.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 3).state());
c4.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 4).state());
c5.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 5).state());
c6.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 6).state());
c7.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 7).state());
c8.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 8).state());
c9.setSelected(!cinema.hall(movieindex).party(partyindex).seat('C', 9).state());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCheckBox a0;
    private JCheckBox a1;
    private JCheckBox a2;
    private JCheckBox a3;
    private JCheckBox a4;
    private JCheckBox a5;
    private JCheckBox a6;
    private JCheckBox a7;
    private JCheckBox a8;
    private JCheckBox a9;
    private JCheckBox b0;
    private JCheckBox b1;
    private JCheckBox b10;
    private JCheckBox b11;
    private JCheckBox b12;
    private JCheckBox b13;
    private JCheckBox b14;
    private JCheckBox b15;
    private JCheckBox b16;
    private JCheckBox b17;
    private JCheckBox b18;
    private JCheckBox b19;
    private JCheckBox b2;
    private JCheckBox b20;
    private JCheckBox b21;
    private JCheckBox b22;
    private JCheckBox b23;
    private JCheckBox b24;
    private JCheckBox b25;
    private JCheckBox b26;
    private JCheckBox b27;
    private JCheckBox b28;
    private JCheckBox b29;
    private JCheckBox b3;
    private JCheckBox b4;
    private JCheckBox b5;
    private JCheckBox b6;
    private JCheckBox b7;
    private JCheckBox b8;
    private JCheckBox b9;
    private JCheckBox c0;
    private JCheckBox c1;
    private JCheckBox c2;
    private JCheckBox c3;
    private JCheckBox c4;
    private JCheckBox c5;
    private JCheckBox c6;
    private JCheckBox c7;
    private JCheckBox c8;
    private JCheckBox c9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JMenuBar jMenuBar1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel9;
    private JLabel moviename;
    private JLabel partydetail;
    // End of variables declaration//GEN-END:variables
}
