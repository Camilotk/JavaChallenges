package org.example.capitulo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAsTextTest {
    /*
    Write method String intAsString(int) which, for a given positive number, converts
    the respective digits into corresponding text.
     */
    private final NumberAsText natt = new NumberAsText();

    @Test
    void itShouldDisplayIntAsText() {
        assertEquals("SEVEN", natt.intAsString(7));
        assertEquals("FOUR TWO", natt.intAsString(42));
        assertEquals("TWO FOUR SIX EIGHT ZERO", natt.intAsString(24680));
        assertEquals("ONE THREE FIVE SEVEN NINE", natt.intAsString(13579));
    }
}