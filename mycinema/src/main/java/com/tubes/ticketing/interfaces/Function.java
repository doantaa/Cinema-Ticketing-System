package com.tubes.ticketing.interfaces;

public interface Function {
    // interface of the functions that an employee can do
    public Boolean login(String usrname, String passwd);
    public String reserveTicket(int movieIndex, int partyIndex, char section, int seatIndex);
    public String cancelTicket(int movieIndex, int partyIndex, char section, int seatIndex);
    public int emCheckAvSeats(int hallIndex, int partyIndex);
}
