import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calc = new Calculator(2,3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        calc = null;
    }

    @org.junit.jupiter.api.Test
    void add() {
        Assertions.assertEquals(2, calc.add(1,2));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Assertions.assertEquals(1, calc.subtract(2,3));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Assertions.assertEquals(6, calc.multiply(2,3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Assertions.assertEquals(0, calc.divide(2,3));
    }
}