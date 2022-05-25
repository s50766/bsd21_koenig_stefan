package at.campus02.bsd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This is the CalculatorTest.java class and here will all methods be tested.
 *
 * @author Stefan König
 */
public class CalculatorTest {

    /**
     * Variable for testing Calculator.java calc.
     */
    private Calculator calc;

    /**
     *
     * setUp Method to start the JUnit testing.
     */
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    /**
     *
     * tearDown Method to shut down the JUnit testing.
     */
    @After
    public void tearDown() {
    }


    /**
     *
     * This Method tests the addition expected method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testAdd_Expected() {
        // 5 + 3
        Assertions.assertEquals(8, calc.add(5, 3));
    }

    /**
     *
     * This Method tests the addition method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testAdd() {
        int a = 6;
        int b = 7;
        double result = a + b;
        Assertions.assertEquals(result, calc.add(a, b));
    }

    /**
     *
     * This Method tests the substraction Expected method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testMinus_Expected() {
        // 5 - 3
        Assertions.assertEquals(2, calc.minus(5, 3));
    }

    /**
     *
     * This Method tests the substraction method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testMinus() {
        int a = 7;
        int b = 6;
        double result = a - b;
        Assertions.assertEquals(result, calc.minus(a, b));
    }

    /**
     *
     * This Method tests the multiplication expected method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testMultiply_Expected() {
        // 5 * 3
        Assertions.assertEquals(15, calc.multiply(5, 3));
    }

    /**
     *
     * This Method tests the multiplication method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testMultiply() {
        int a = 6;
        int b = 7;
        double result = a * b;
        Assertions.assertEquals(result, calc.multiply(a, b));
    }

    /**
     *
     * This Method tests the division expected method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testDivide_Expected() {
        // 15 / 3
        Assertions.assertEquals(5, calc.divide(15, 3));
    }

    /**
     *
     * This Method tests the division method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testDivide() {
        int a = 6;
        int b = 3;
        double result = a / b;
        Assertions.assertEquals(result, calc.divide(a, b));
    }

    /**
     *
     * This Method tests the division by zero method.
     *
     * @return      checks if the method throws an exception.
     */
    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
    }

    /**
     *
     * This Method tests the faculty method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testFaculty1() {
        Assertions.assertEquals(0, calc.faculty(-2));
    }

    /**
     *
     * This Method tests the faculty method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testFaculty2() {
        double result = 5 * 4 * 3 * 2 * 1;
        Assertions.assertEquals(result, calc.faculty(5));
    }

    /**
     *
     * This Method tests the faculty method.
     *
     * @return      checks if method is implemented correctly.
     */
    @Test
    public void testFaculty3() {
        double result = 6 * 5 * 4 * 3 * 2 * 1;
        Assertions.assertEquals(result, calc.faculty(6));

    }


}
