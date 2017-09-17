package com.example.olympicgames;

/**
 * Created by allysonwilson on 9/15/17.
 */


public class Event implements Participation{

    private Medal medal;
    public String name;
    Arraylist<Participation> athletes;
    Arraylist<Athlete> team;

    public Event(Medal medal, String name) {
        this.medal = medal;
        this.name = name;
        this.athletes = new ArrayList<>();

    }

    public Medal getMedal() {
        return medal;
    }

    public String getName() {
        return name;
    }

    public Araylist<Participation> getAthletes() { return this.athletes; }


    //    enummap?

//    award medals
//   a switch statement vs if else




}

