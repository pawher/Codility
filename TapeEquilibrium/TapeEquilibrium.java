package TapeEquilibrium;

public class TapeEquilibrium {

	public int solution(int[] A) {

		int start = A[0];
		int end = 0;
		int result;
		int temp = Integer.MAX_VALUE;

		for (int i = 1; i < A.length; i++) {
			end = end + A[i];
		}

		for (int i = 1; i < A.length; i++) {
			result = Math.abs(start - end);

			if (result < temp) {
				temp = result;
			} else {
				return result;
			}

			start = start + A[i];
			end = end - A[i];
		}

		return temp;
	}
}
