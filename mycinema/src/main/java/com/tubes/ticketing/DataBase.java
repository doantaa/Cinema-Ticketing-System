
package com.tubes.ticketing;

import java.util.ArrayList;

public class DataBase {


    final static private String[]
            user1 = {
            "Ananta Wardana Hartanta",
            "admin",
            "ananta@ittelkom-pwt.ac.id",
            "admin"},

            user2 = {
                    "IT Telkom",
                    "ittelkompurwokerto",
                    "ittelkom@gmail.com",
                    "ittp"};


    static private ArrayList<String[]> user = new ArrayList<>(5);
    
    
    static public String getQuery(int empIndex, String datafield){
        
        user.add(user1);
        user.add(user2);

        
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
