package prj.binary.search;

public class BinarySearch {

	private MidPointCalculator mpc;

	public BinarySearch(MidPointCalculator mpc) {
		this.mpc = mpc;
	}

	/**
	 * find the position of 'target' in presorted array a.
	 * 
	 * @param sortedArray
	 *            sorted array of integers
	 * @param target
	 *            the target integer
	 * @param position
	 *            /index of 'target' in array sortedArray, or -1 if 'target' is not in sortedArray.
	 */
	public int search(int[] sortedArray, int target) {
		int min = 0;
		int max = sortedArray.length-1;
		int middlePoint = 0;
		
		while (min <=max) {
			middlePoint = mpc.calculateMidPointOfRange(min, max);
			if (sortedArray[middlePoint] > target) {
				max = middlePoint -1 ;
			} else if (sortedArray[middlePoint] < target) {
				min = middlePoint +1 ;
			} else {
				return middlePoint;
			}
		}
		return -1;
	}
}