package com.tubes.ticketing;
public class Seat {
    private char section;
    private int index;
    private Boolean free;

    public Seat(char section, int index){ // contructor
        this.section = section;
        this.index = index;
        this.free = true;
         
    }

    // method to check the state of a seat, free or not
    public Boolean state(){
        if (this.free == true){
            return true;
        }
        else
            return false;
    }

    // method reserves a seat, change free value to true
    public void reserve(){
            if(this.state() == true){
                this.free = false;
            }
            else{
                throw new ArithmeticException("Cannot reserve seat, this seat is already taken!");
            }
        }
    

    public void reclaim(){ // frees a free seat
        this.free = true;
    }
    
    @Override
    public String toString(){
        return "Seat :" + section + index;
    }
    
}