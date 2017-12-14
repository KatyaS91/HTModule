package test_ng;

import test_ng.dataprovider.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Katsiaryna_Skarzhyns on 12/11/2017.
 */
public class SubTest extends CalculatorBaseTest {

	@Test(dataProviderClass = TestData.class, dataProvider = "subDp", groups = "p1")
	public void sub_test(long arg1, long arg2, long expected) {
		long result = calculator.sub(arg1, arg2);
		Assert.assertEquals(result, expected);
	}
}