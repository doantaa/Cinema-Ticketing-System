package com.tubes.ticketing;
import java.util.ArrayList;


public class Hall {
   private Movie movie;
   // 2D array holding parties time table {{from, to}, {from, to}, .... }
   private String partiesSchedule[][] = {{"12:00pm", "2:00pm"}, {"2:10pm", "4:10pm"}, {"4:20pm", "6:20pm"}, {"6:30pm", "8:30pm"}, {"8:40", "9:40"}};
   private ArrayList<Schedule> partiesArrayList = new ArrayList<Schedule>(5); // ArrayList hold Party objects
   
   public Hall(){ // constructor
       setParties(partiesSchedule);
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Movie getMovie() {
        return movie;
    }
    // method to take the data from the 2D array and makes objects of them, then adds them to the ArrayList
    private void setParties(String[][] partiesSchedule){
       for(int i=0; i < partiesSchedule.length; i++){
           for(int j=0; j < partiesSchedule[i].length; j = j + 2){
               partiesArrayList.add(new Schedule(partiesSchedule[i][j], partiesSchedule[i][j+1]));
           }
       } 
    }
    // method to access a specific party inside the ArrayList
    public Schedule party(int index){
        return partiesArrayList.get(index);
    }

    public String[] getParties(){
        String[] prts = new String[5];
        for(int i = 0; i < partiesArrayList.size(); i++){
            prts[i] = partiesArrayList.get(i).toString();
        }
        return prts;
    }
   }


