package com.tubes.ticketing;

import com.tubes.ticketing.abstracts.AbsCinema;

public class Cinema extends AbsCinema {
   // cinema's constructor
   public Cinema(String name, int numOfHalls, int numOfMovies, int numOfParties, String[][] moviestitles){
       this.name = name;
       this.numOfHalls = numOfHalls;
       this.numOfMovies = numOfMovies;
       this.numOfParties = numOfParties;
       generateHalls(numOfHalls);
       addMovies(moviestitles);
       assignMovieToHall();

   }
//Todo Polymorphism
   @Override 
   public void setName(String name) {
       this.name = name;
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public void setNumOfHalls(int numOfHalls) {
       this.numOfHalls = numOfHalls;
   }
   @Override
   public int getNumOfHalls() {
       return numOfHalls;
   }
   @Override
   public void setNumOfMovies(int numOfMovies) {
       this.numOfMovies = numOfMovies;
   }
   @Override
   public int getNumOfMovies() {
       return numOfMovies;
   }
   @Override
   public void setNumOfParties(int numOfParties) {
       this.numOfParties = numOfParties;
   }
   @Override
   public int getNumOfParties() {
       return numOfParties;
   }
   @Override // method to create new halls and add them to the ArrayList
   protected void generateHalls(int numOfHalls){
       for(int i = 0; i < numOfHalls; i++){
           halls.add(new Hall());
       }
   }

   @Override // method to access a specific hall inside the ArrayList
   public Hall hall(int index){
       return halls.get(index);
   }
    @Override // method that takes a two dimentional array of strings containing movies' info and creating Movie objects out of them
    protected void addMovies(String[][] m){
      for(int i=0; i < m.length; i++){
          for(int j = 0; j < m[i].length ; j = j + 2){
            moviesArrayList.add(new Movie(m[i][j], Integer.parseInt(m[i][j+1])));
          }
      } 
       
   }
   @Override // method to access a specific Movie object from the ArrayList
   public Movie movie(int index){
       return moviesArrayList.get(index);
   }
   @Override // method assgines a movie for each hall
   protected void assignMovieToHall(){
       for(int i = 0; i < moviesArrayList.size(); i++){
           halls.get(i).setMovie(moviesArrayList.get(i));
       }
   }

   public String[] getMovies(){
       String [] mvtitles = new String[5];
       for(int i = 0; i < moviesArrayList.size() ; i++){
           mvtitles[i] = moviesArrayList.get(i).getTitle();
       }
       return mvtitles;
   }


}
