package MaxSliceSum;

public class MaxSliceSum {

	final static int MIN = -1000000;

	public int solution(int[] A) {

		int temp = 0;
		int result = MIN;

		for (int i : A) {

			temp = Math.max(i, temp + i);
			result = Math.max(result, temp);

		}
		return result;
	}
}
