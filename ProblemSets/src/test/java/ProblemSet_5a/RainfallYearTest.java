package ProblemSet_5a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "RainfallYear" class.
 *
 * @author Stella Kazamia
 */
public class RainfallYearTest {

	RainfallYear rainfall = new RainfallYear(2020);

	@Test
	public void testConstruction() {
		assertEquals(2020, rainfall.getYear());
		assertEquals(0, rainfall.getRainfallMonth("JANUARY"), 0);

	}

	@Test
	public void testInitialise() {
		double[] data = new double[] { 69, 43, 56, 52, 55, 53, 48, 57, 64, 68, 71, 71 };
		rainfall.enterData(data);
		assertEquals(56, rainfall.getRainfallMonth("MARCH"), 0);

	}

	@Test
	public void testCalculateMean() {
		double[] data = new double[] { 73, 43, 56, 52, 55, 53, 48, 57, 64, 68, 71, 71 };
		rainfall.enterData(data);
		assertEquals(55, rainfall.getRainfallMonth("MAY"), 0);
		assertEquals(59.25, rainfall.calculateMeanRainfall(), 0);
	}

	@Test
	public void testHighest() {
		double[] data = new double[] { 50, 43, 56, 52, 40, 53, 48, 57, 64, 68, 71, 71 };
		rainfall.enterData(data);
		assertEquals(52, rainfall.getRainfallMonth("APRIL"), 0);
		assertEquals(71, rainfall.calculateHighestRainfall(), 0);
	}

	@Test
	public void testInvalidMean() {
		assertEquals(0, rainfall.calculateMeanRainfall(), 0);
	}

	@Test
	public void testInvalidHighest() {
		assertEquals(0, rainfall.calculateHighestRainfall(), 0);
	}

	@Test
	public void testMissingData() {
		RainfallYear latest = new RainfallYear(2023);
		double[] data = new double[] { 40, 53, 66, 42, 50, 63, 58, 47, 54, 0, 0, 0 };
		latest.enterData(data);
		assertEquals(0, latest.getRainfallMonth("OCTOBER"), 0);
		assertEquals(0, latest.getRainfallMonth("NOVEMBER"), 0);
		assertEquals(0, latest.getRainfallMonth("DECEMBER"), 0);
	}
}
