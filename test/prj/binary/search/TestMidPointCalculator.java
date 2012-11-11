package prj.binary.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestMidPointCalculator {

	private MidPointCalculator midIndexCalculator;

	@Before
	public void setUp() {
		midIndexCalculator = new MidPointCalculatorImpl();
	}
	
	@Test
	public void testOneIsReturnedAsMiddlePointOfRange0To2() {
		assertEquals("Middle point of range going from 0 to 2 must be 1",new Integer(1),midIndexCalculator.calculateMidPointOfRange(0,2));
	}
	
	@Test
	public void testTwoIsReturnedAsMiddlePointOfRange0To4() {
		assertEquals("Middle point of range going from 0 to 4 must be 2",new Integer(2),midIndexCalculator.calculateMidPointOfRange(0,4));
	}
	
	@Test
	public void testFourIsReturnedAsMiddlePointOfRange4To4() {
		assertEquals("Middle point of range going from 4 to 4 must be 4",new Integer(4),midIndexCalculator.calculateMidPointOfRange(4,4));
	}
	
	@Test
	public void testZeroIsReturnedAsMiddlePointOfRange0To1() {
		assertEquals("Middle point of range going from 0 to 1 must be 0",new Integer(0),midIndexCalculator.calculateMidPointOfRange(0,1));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrownInCaseANegativeRangeIsProvided() {
		midIndexCalculator.calculateMidPointOfRange(5,4);
	}
	
}
