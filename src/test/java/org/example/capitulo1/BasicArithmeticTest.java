package org.example.capitulo1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BasicArithmeticTest {
    /* Write method int calc(int, int) that multiplies two variables, m and n of type int,
       then divides the product by two, and outputs the remainder with respect to division by 7. */

    private final BasicArithmetic ba = new BasicArithmetic();

    @Test
    void itShouldCalcTwoNumbers() {
        assertEquals(0, ba.calc(6, 7));
        assertEquals(6, ba.calc(3,4));
        assertEquals(5, ba.calc(5,5));
    }
}