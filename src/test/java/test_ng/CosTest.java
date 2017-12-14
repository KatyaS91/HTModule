package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends CalculatorBaseTest {

    @Test(groups = "p1")
    public void cos_test() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 0);
    }
}