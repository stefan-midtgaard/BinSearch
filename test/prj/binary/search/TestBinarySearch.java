package prj.binary.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch {

	MidPointCalculator mpc;
	private BinarySearch binarySearch;
	
	@Before
	public void setUp() {
		mpc = new MidPointCalculatorImpl();
		binarySearch = new BinarySearch(mpc);
	}
	
	@Test
	public void returnIndex0GivenArray123AndTarget1() {
		assertEquals("Given array 1,2,3 and target 1, then index 0 must be returned", 0, binarySearch.search(new int[]{1,2,3}, 1));
		assertEquals("MidPointCalculator must called twice - the range should be split into half two times", 2, mpc.getNumberOfInvocations());

	}
	
	@Test
	public void returnIndexMinusOneGivenArray123AndTarget4() {
		assertEquals("Given array 1,2,3 and target 4, then index -1 must be returned", -1, binarySearch.search(new int[]{1,2,3}, 4));
		assertEquals("MidPointCalculator must called twice - the range should be split into half two times", 2, mpc.getNumberOfInvocations());
	}
	
	
	@Test
	public void returnIndex2GivenArray123AndTarget3() {
		assertEquals("Given array 1,2,3 and target 3, then index 2 must be returned", 2, binarySearch.search(new int[]{1,2,3}, 3));
		assertEquals("MidPointCalculator must called twice - the range should be split into half two times", 2, mpc.getNumberOfInvocations());
	}
	
	@Test
	public void returnIndexMinus1GivenAnEmptyArrayAndTarget3() {
		assertEquals("Given an empty array and target 3, then index -1 must be returned", -1, binarySearch.search(new int[]{}, 3));
		assertEquals("MidPointCalculator is not invoked", 0, mpc.getNumberOfInvocations());
	}
	
	
	@Test
	public void returnIndex3AndCallMidPointCalculatorThriceGivenArray2_7_9_11_14_15AndTarget11() {
		assertEquals("Given array 2,7,9,11,14,15 and target 11, then return index 3", 3, binarySearch.search(new int[]{2,7,9, 11, 14,15}, 11));
		assertEquals("MidPointCalculator must called thrice - the range should be split into half three times", 3, mpc.getNumberOfInvocations());
	}

	@Test
	public void returnIndex1AndCallMidPointCalculatorThriceGivenArray2_7_9_11_14_15AndTarget7() {
		assertEquals("Given array 2,7,9,11,14,15 and target 7, then return index 1", 1, binarySearch.search(new int[]{2,7,9, 11, 14,15}, 7));
		assertEquals("MidPointCalculator must called thrice - the range should be split into half three times", 3, mpc.getNumberOfInvocations());
	}
	
	@Test
	public void returnIndex1AndCallMidPointCalculatorThriceGivenArrayMinus100_Minus6_2_7_9_11_14_15AndTargetMinus6() {
		assertEquals("Given array -100,-6,2,7,9,11,14,15 and target -6, then return index 1", 1, binarySearch.search(new int[]{-100, -6,2,7,9, 11, 14,15}, -6));
		assertEquals("MidPointCalculator must called thrice - the range should be split into half three times", 2, mpc.getNumberOfInvocations());
	}

}
