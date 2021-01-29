package com.example.matrixlite;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NunirsTest {

    @Test
    public void NameValid() {
        assertFalse(com.example.matrixlite.Test.NameValid("1"));
        assertFalse(com.example.matrixlite.Test.NameValid("2"));
        assertFalse(com.example.matrixlite.Test.NameValid("3"));
        assertFalse(com.example.matrixlite.Test.NameValid("4"));
        assertFalse(com.example.matrixlite.Test.NameValid("5"));
        assertFalse(com.example.matrixlite.Test.NameValid("6"));
    }

    @Test
    public void Lengs() {
        assertFalse(com.example.matrixlite.Test. NumberLeng(("3458")));
        assertTrue(com.example.matrixlite.Test. NumberLeng(("32156578")));

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() {
        String str = null;
        assertTrue(str.isEmpty());
    }


}
