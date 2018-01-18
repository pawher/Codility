package MissingInteger;

import java.util.Arrays;

public class MissingInteger {

	public int solution(int[] A) {
		Arrays.sort(A);
		int index = Arrays.binarySearch(A, 1);

		if (index < 0) {
			return 1;
		}

		for (int i = index; i < A.length - 1; i++) {
			if (A[i + 1] - A[i] > 1) {
				return A[i] + 1;
			}
		}
		return A[A.length - 1] + 1;
	}
}
