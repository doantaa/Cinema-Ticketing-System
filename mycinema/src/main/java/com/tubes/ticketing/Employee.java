package com.tubes.ticketing;

import com.tubes.ticketing.interfaces.Function;

public class Employee implements Function { // employee class implements the interface "CanFunction"
    
    private String name;
    private String username;
    private String email;
    private String password;
    private Cinema cinemaBranch = App.c1;

    // employee's constructor
    public Employee(String name, String username, String email, String password){
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        
    }
    
    public void setName(String name) {
       this.name = name;
    }
    
     public String getName() {
       return name;
   }
     
   public void setUsername(String username) {
       this.username = username;
   }
    
   public String getUsername() {
       return username;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }
   
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
     public String getPassword() {
         return password;
     }

    @Override // method to validate login info
    public Boolean login(String usrname, String passwd) {
       if ((this.username == usrname || this.email == usrname) && this.password == passwd){
           return true;
       }
       else{
           return false;
       }
    }

    @Override // method to reserve a ticket
    public String reserveTicket(int hallIndex, int partyIndex, char section, int seatIndex) {
        // employee is NOT interacting directly with the methods defined in the other classes
        try{ // Exception handling if employee entered an out of range seat number
                if(emCheckAvSeats(hallIndex, partyIndex) < 1){
                return "Not enough seats"; // if not enough seats
                }
                else if(cinemaBranch.hall(hallIndex).party(partyIndex).seat(section, seatIndex).state() == true){ //free or not
                    cinemaBranch.hall(hallIndex).party(partyIndex).seat(section, seatIndex).reserve();
                    // creating a Ticket object after reserving a seat
                   return new Ticket(cinemaBranch.getName(), cinemaBranch.hall(hallIndex).getMovie().toString(), cinemaBranch.hall(hallIndex).party(partyIndex).toString(), cinemaBranch.hall(hallIndex).party(partyIndex).seat(section, seatIndex).toString(), this.getName()).toString();
                }
                else {
                    try{
                    throw new ArithmeticException("you are trying to reserve an already reserved seat.");
                    } catch(Exception eee) {return "Maaf kursi sudah diambil";}
                }
        } catch (Exception e){
            return "ERROR: Invalid Seat Index, please mind the number of seats for the selected section";
        }
    }

    @Override // method to reclaim a taken seat in case of ticket cancellation
    public String cancelTicket(int movieIndex, int partyIndex, char section, int seatIndex) {
        cinemaBranch.hall(movieIndex).party(partyIndex).seat(section, seatIndex);
        return "Seat reclaimed.";
    }
    
    @Override // methods returns an integer of the free seats in a party
    public int emCheckAvSeats(int hallIndex, int partyIndex) {
        return cinemaBranch.hall(hallIndex).party(partyIndex).countAvSeats();
    }
      
}
