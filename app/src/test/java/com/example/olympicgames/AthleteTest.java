package com.example.olympicgames;

import org.junit.Test;
import org.junit.Before;

/**
 * Created by allysonwilson on 9/15/17.
 */

public class AthleteTest {
    Athlete athlete;

    @Before
    public void before(){
        athlete = new Athlete("Bill", "USA");
        athlete = new Athlete("Kwai", "China");
    }


    @Test
    public void testAthleteHasName(){
        assertEquals("Kwai", athlete.getName() );
    }

}
