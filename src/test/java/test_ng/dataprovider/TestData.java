package test_ng.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by Katsiaryna_Skarzhyns on 12/11/2017.
 */
public class TestData {

	@DataProvider(name = "sumDp")
	public static Object[][] sumDp() {
		return new Object[][]{
				{1, 1, 2},
				{0, 1, 1},
				{-1, 1, 0}
		};
	}

	@DataProvider(name = "multDp")
	public static Object[][] multDp() {
		return new Object[][]{
				{1, 2, 2},
				{0, 1, 0},
				{-1, 1, -1}
		};
	}
	@DataProvider(name = "subDp")
	public static Object[][] subDp() {
		return new Object[][]{
				{1, 2, -1},
				{3, 2, 1},
				{-5, 2, -7}
		};
	}

	@DataProvider(name = "divDp")
	public static Object[][] divDp() {
		return new Object[][]{
				{6, 2, 3},
				{-6, 2, -3},
				{1, 1, 1}
		};
	}
}