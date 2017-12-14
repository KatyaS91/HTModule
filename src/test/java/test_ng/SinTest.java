package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinTest extends CalculatorBaseTest {

    @Test(groups = "p1")
    public void sin_test() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0.0);
    }
}
