package com.tubes.ticketing;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class Ticket {
    private static int numOfTickets = 0;
    private int id;
    private String movieName;
    private String party;
    private String seat;
    private String employeeName;


    public Ticket(String cinemaName, String movieName, String party, String seat, String employeeName){ // consructor
        this.id = numOfTickets + 1;
        numOfTickets++;
        this.movieName = movieName;
        this.party = party;
        this.seat = seat;
        this.employeeName = employeeName;
        System.out.println(toString()); // prints the ticket details to the screen upon creation of that ticket
    }

    private String getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
//Todo Polymorphism
    @Override
    public String toString() {
        return
                employeeName + "\n" +
                getDateTime() + "" +
                "\n\n" +
                id + "" +
                "\n" +
                movieName + "\n" +
                party + "\n" +
                seat+"\n";
    }
}
