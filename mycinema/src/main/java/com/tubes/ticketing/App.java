package com.tubes.ticketing;

import com.tubes.ticketing.layout.Login;

public class App {

     static String moviestitle[][] = {{"Batman: Dark Knight", "120"}, {"Superman", "200"}, {"Predestination","150"},{"The Mummy", "190"}, {"Spiderman: No Way Home","132"}};
     public static Cinema c1 = new Cinema("Movie Ticketing System", 5, 5, 5, moviestitle);


    public static void main(String[] args) throws Exception {
      

      new Login().setVisible(true);
       
        
         
    }
}
