package com.example.olympicgames;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by allysonwilson on 9/16/17.
 */

public class EventTest {
    Event event;

    @Before
    public void before() {
        event = new Event(Medal.GOLD, "Synchronized Swimming");
    }

    @Test
    public void canGetMedal() {
        assertEquals(Medal.GOLD, event.getMedal() ); }


    @Test
    public void canGetName() {
        assertEquals("Synchronized Swimming", event.getName() );
    }

}
//if Athlete athlete || TeamOfAthlete team
//else

//or a ternary?
//
//for loop