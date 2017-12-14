package test_ng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgText extends CalculatorBaseTest {

    @Test
    public void ctg_test() {
        double result = calculator.ctg(45);
        Assert.assertEquals(result, 1.0);
    }
}
