package org.example.capitulo1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BasicArithmeticTest {

    private BasicArithmetic ba = new BasicArithmetic();

    @Test
    void itShouldCalcTwoNumbers() {
        assertEquals(0, ba.calc(6, 7));
        assertEquals(6, ba.calc(3,4));
        assertEquals(5, ba.calc(5,5));
    }
}