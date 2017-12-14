package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest extends CalculatorBaseTest {

    @Test(groups = "p0")
    public void isNegative_test() {
        boolean result = calculator.isNegative(-1);
        Assert.assertTrue(result);
    }

    @Test(groups = "p0")
    public void isNegativeException_test() {
        boolean result = calculator.isNegative(0);
        Assert.assertFalse(result);
    }
}