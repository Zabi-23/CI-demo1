//CalculatorTest.java
package com.example.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    private final int a = 8;
    private final int b = 4;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @Test
    void add_should_add_tow_numbers() {
        int result = calculator.add(a, b);
        assertEquals(12,result);

    }

    @Test
    void subtract() {
        int result = calculator.subtract(a, b);
        assertEquals(4, result );
    }

    @Test
    void divide_should_return_correct_value() {
        int result = calculator.divide(a, b);  // 8 / 4
        assertEquals(2, result);
    }


    @Test
    void divide_should_throw_exception_when_dividing_by_zero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(a, 0),
                "Division med noll ska kasta IllegalArgumentException");
    }


    @Test
    void multiply() {
        int result = calculator.multiply(a, b) ;
        assertEquals( 32, result ) ;
    }

    @Test
    void square_should_return_correct_result() {
        assertEquals(64, calculator.square(a),"Square ska beräkna korrekt värde");
    }

    @Test
    void power_should_handle_positive_exponents() {
        assertEquals(4096, calculator.power(8, 4), "Power ska fungera för positiva exponenter");
    }

    @Test
    void power_should_handle_negative_exponents() {
        assertEquals(0, calculator.power(2, -3),
                "Math.pow returnerar double < 1, cast till int blir 0");
    }
}

