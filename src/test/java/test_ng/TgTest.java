package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends CalculatorBaseTest {

    @Test(groups = "p1")
    public void tg_test() {
        double result = calculator.tg(225);
        Assert.assertEquals(result, 1);
    }
}
