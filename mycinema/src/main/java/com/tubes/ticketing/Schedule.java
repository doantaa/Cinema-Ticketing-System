package com.tubes.ticketing;
import java.util.ArrayList;

public class Schedule {
    private String from;
    private String to;
    
    protected static int TotalNumOfChairs = 50;
    protected static int NumOfSections = 3;
    // halls contain 50 seats, divided on sections; A, B and C: A and C contain 10 seat
    // B contain 30 seat, see "/hallseats" textfile to visualize
    // below are the ArrayLists holding those seat 
    private ArrayList<Seat> secA = new ArrayList<Seat>(10); // section A seats
    private ArrayList<Seat> secB = new ArrayList<Seat>(30); // section B seats
    private ArrayList<Seat> secC = new ArrayList<Seat>(10); // section C seats
    
    public Schedule(String from, String to){ // constructor
        this.from = from;
        this.to = to;
        generateSeats();
    }

    // method to create objects of type Seat and store them in  the ArrayList for each section
    private void generateSeats(){
        for (int i = 0; i < 10; i++){
          secA.add(new Seat('A', i));
          secC.add(new Seat('C', i)); 
       }
       for (int i = 0; i < 30; i++){
           secB.add(new Seat('B', i));
       }
       
   }

   // method to access seats stored in the ArrayLists, takes section character and seat index as parameters
   public Seat seat(char section, int chair){
       if (section == 'A' || section == 'a'){
           return secA.get(chair);
       }
       else if (section == 'B' || section == 'b'){
           return secB.get(chair);
       }
       else if(section == 'C' || section == 'c'){
            return secC.get(chair);
       }
       else {
            throw new ArithmeticException("Error: Invalid section.");
       }
    }

    // method returns an integer of the free seats
    public int countAvSeats(){
        int freeSeats = 0;
        for(int i = 0; i < 10 ; i++){
            if(secA.get(i).state() == true){
                freeSeats = freeSeats + 1;
            }
            if(secC.get(i).state() == true){
                freeSeats = freeSeats + 1;
            }
        }
        for(int j = 0; j < 30; j++){
            if(secB.get(j).state() == true){
                freeSeats = freeSeats + 1;
            }
        }
        return freeSeats;
    }

    @Override
    public String toString(){
        return from + " to " + to;
    }
}
