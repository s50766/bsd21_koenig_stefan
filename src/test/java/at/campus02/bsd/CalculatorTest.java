package at.campus02.bsd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

private Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @After
    public void tearDown(){};

    @Test
    public void testAdd_Expected(){
        // 5 + 3
    Assertions.assertEquals(8,Calculator.add(5,3));
    }

    @Test
    public void testAdd(){
        int a = 6; int b = 7;
        double result = a + b;
        Assertions.assertEquals(result,Calculator.add(a,b));
    }

    @Test
    public void testMinus_Expected(){
        // 5 - 3
        Assertions.assertEquals(2,Calculator.minus(5,3));
    }

    @Test
    public void testMinus(){
        int a = 7; int b = 6;
        double result = a - b;
        Assertions.assertEquals(result,Calculator.minus(a,b));
    }

    @Test
    public void testMultiply_Expected(){
        // 5 * 3
        Assertions.assertEquals(15,Calculator.multiply(5,3));
    }

    @Test
    public void testMultiply(){
        int a = 6; int b = 7;
        double result = a * b;
        Assertions.assertEquals(result,Calculator.multiply(a,b));
    }

    @Test
    public void testDivide_Expected(){
        // 15 / 3
        Assertions.assertEquals(5,Calculator.divide(15,3));
    }

    @Test
    public void testDivide(){
        int a = 6; int b = 3;
        double result = a / b;
        Assertions.assertEquals(result,Calculator.divide(a,b));
    }

}
