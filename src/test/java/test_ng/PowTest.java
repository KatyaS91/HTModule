package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowTest extends CalculatorBaseTest {

    @Test(groups = "p1")
    public void pow_test() {
        double result = calculator.pow(1, 1);
        Assert.assertEquals(result, 1);
    }
}
