package code_review_work.src.test.java;

import code_review_work.src.main.java.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(3, 5));
        assertEquals(0, calc.add(-2, 2));
        assertEquals(-10, calc.add(-5, -5));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-4, calc.dif(2, 6));
        assertEquals(0, calc.dif(7, 7));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.div(9, 3));
        assertEquals(2, calc.div(10, 5));
        assertThrows(ArithmeticException.class, () -> calc.div(5, 0));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.times(3, 5));
        assertEquals(0, calc.times(0, 10));
        assertEquals(-20, calc.times(-4, 5));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.solver());
    }
}