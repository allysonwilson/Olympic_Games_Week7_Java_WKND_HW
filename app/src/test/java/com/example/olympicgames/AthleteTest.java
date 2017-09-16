package com.example.olympicgames;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by allysonwilson on 9/15/17.
 */

public class AthleteTest {
    Athlete athlete;

    @Before
    public void before(){ athlete = new Athlete("Kwai", "China"); }


    @Test
    public void testAthleteHasName() {
        assertEquals("Kwai", athlete.getName() );
    }

    @Test
    public void testAthleteHasCountry() {
        assertEquals("China", athlete.getCountry() );
    }


}


//public class GuitarTest {
//    Guitar guitar;
//
//    @Before
//    public void before() { guitar = new Guitar("Black", "String", 6); }
