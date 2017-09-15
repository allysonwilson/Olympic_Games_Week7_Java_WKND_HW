package com.example.olympicgames;

/**
 * Created by allysonwilson on 9/15/17.
 */

public class Athlete {
    public String name;
    public String country;


    public Athlete( String name, String country){
        this.name = name;
        this.country = country;

    }

    public String getName() {
        return name;
    }
}
//implements Participation