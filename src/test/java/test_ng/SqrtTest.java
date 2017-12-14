package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtTest extends CalculatorBaseTest {

    @Test(groups = "p1")
    public void sqrt_test() {
        double result = calculator.sqrt(100);
        Assert.assertEquals(result, 10);
    }
}
