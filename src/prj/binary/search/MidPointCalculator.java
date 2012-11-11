package prj.binary.search;

public interface MidPointCalculator {

	/**
	 * Calculates the middle point of a range.
	 * 
	 * @param min - lowest value in range
	 * @param max - highest value in range
	 * @return middle point in range
	 */
	public Integer calculateMidPointOfRange(Integer min, Integer max);

	public int getNumberOfInvocations();

}