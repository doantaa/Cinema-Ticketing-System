package com.tubes.ticketing.abstracts;
import com.tubes.ticketing.Hall;
import com.tubes.ticketing.Movie;

import java.util.ArrayList;
// abstract class for cinema
public abstract class AbsCinema { 
   protected String name;
   protected int numOfHalls;
   protected int numOfMovies;
   protected int numOfParties;
   protected ArrayList<Hall> halls = new ArrayList<Hall>(); // ArrayList to hold the cinema's halls
   public ArrayList<Movie> moviesArrayList = new ArrayList<Movie>(); // ArrayList to hold the cinema's movies

   abstract public void setName(String name);
   abstract public String getName();
   abstract public void setNumOfHalls(int numOfHalls);
   abstract public int getNumOfHalls();
   abstract public void setNumOfMovies(int numOfMovies);
   abstract public int getNumOfMovies();
   abstract public void setNumOfParties(int numOfParties);
   abstract public int getNumOfParties();
   abstract public Hall hall(int index);
   abstract protected void generateHalls(int numOfHalls);
   abstract protected void addMovies(String[][] movieslist);
   abstract protected void assignMovieToHall();
   abstract public Movie movie(int index);
}
