package com.example.olympicgames;

/**
 * Created by allysonwilson on 9/15/17.
 */

public class Athlete {
    public String name;
    public String country;
    Arraylist<Participation> athletes;
//    private int position;


    public Athlete(String name, String country){
        this.name = name;
        this.country = country;
        this.athletes = new ArrayList<>();
//        this.position = 0;
    }
    public Araylist<Participation> getAthletes() { return this.athletes; }

    public String getName() {
        return name;
    }


    public String getCountry() { return country;}

//
//    public int getPosition() {
//        return position;
//    }



}
//implements Participation