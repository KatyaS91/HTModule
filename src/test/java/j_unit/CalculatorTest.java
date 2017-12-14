package j_unit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;
    private static final double DELTA = 1e-15;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void cleanUp() {
        System.out.println("Finish");
    }

    @Test
    public void div() {
        long result = calculator.div(4, 2);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void sum() {
        long result = calculator.sum(4, 2);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void sub() {
        long result = calculator.sub(1, 2);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void mult() {
        long result = calculator.mult(1, 2);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void pow() {
        double result = calculator.pow(1, 1);
        Assert.assertEquals(result, 1, DELTA);
    }

    @Test
    public void sqrt() {
        double result = calculator.sqrt(100);
        Assert.assertEquals(result, 10, DELTA);
    }

    @Test
    public void tg() {
        double result = calculator.tg(225);
        Assert.assertEquals(result, 1, DELTA);
    }

    @Test
    public void ctg() {
        double result = calculator.ctg(45);
        Assert.assertEquals(result, 1, DELTA);
    }

    @Test
    public void cos() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 0, DELTA);
    }

    @Test
    public void sin() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0.0, DELTA);
    }

    @Test
    public void isPositive() {
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result);
    }

    @Test
    public void isNegative() {
        boolean result = calculator.isNegative(-1);
        Assert.assertTrue(result);
    }
}