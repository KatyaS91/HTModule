package test_ng;

import test_ng.dataprovider.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Katsiaryna_Skarzhyns on 12/11/2017.
 */
public class MultTest extends CalculatorBaseTest {

	@Test(dataProviderClass = TestData.class, dataProvider = "multDp", groups = "p0")
	public void mult_test(long arg1, long arg2, long expected) {
		long result = calculator.mult(arg1, arg2);
		Assert.assertEquals(result, expected);
	}
}