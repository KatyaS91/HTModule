package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest extends CalculatorBaseTest {

    @Test(groups = "p0")
    public void isPositive_test() {
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result);
    }

    @Test(groups = "p0")
    public void isPositiveException_test() {
        boolean result = calculator.isPositive(0);
        Assert.assertFalse(result);
    }
}