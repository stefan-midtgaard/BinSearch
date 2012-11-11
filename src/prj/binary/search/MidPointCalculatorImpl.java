package prj.binary.search;

public class MidPointCalculatorImpl implements MidPointCalculator {

	
	private int numberOfInvocations;

	@Override
	public Integer calculateMidPointOfRange(Integer min, Integer max) {
		numberOfInvocations++;
		if (max < min) {
			throw new IllegalArgumentException("Max value cannot be smaller than min value");
		}
		
		
		return ((min+max)/2);
				
				//max-((max-min)/2)
	}

	@Override
	public int getNumberOfInvocations() {
		return numberOfInvocations;
	}

}
