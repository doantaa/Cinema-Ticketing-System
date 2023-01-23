
package com.tubes.ticketing;

import java.util.ArrayList;

public class DataBase {


     public static String[][] userList=  {
            {
                    "Ananta Wardana Hartanta",
                    "admin",
                    "ananta@ittelkom-pwt.ac.id",
                    "admin"},

            {
                    "IT Telkom",
                    "ittelkompurwokerto",
                    "ittelkom@gmail.com",
                    "ittp"},

            {
                    "Admin Kasir",
                    "adminkasir",
                    "adminkasir@ittelkom-pwt.ac.id",
                    "adminkasir"},
            {
                    "Admin",
                    "",
                    "admin@moviesystem.ac.id",
                    ""}
    };


    static private ArrayList<String[]> user = new ArrayList<>(5);
    
    
    static public String getQuery(int empIndex, String datafield){

        for (String[] u: userList ){
            user.add(u);
        }


        if(datafield == "fname"){
            return user.get(empIndex)[0];
        }
        else if (datafield == "username"){
            return user.get(empIndex)[1];
        }
        else if (datafield == "email"){
            return user.get(empIndex)[2];
        }
        else if (datafield == "password"){
            return user.get(empIndex)[3];
        }
        else throw new ArithmeticException("database error: non existing datafield");
    }
}
