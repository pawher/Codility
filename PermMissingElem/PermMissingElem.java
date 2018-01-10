package PermMissingElem;

import java.util.Arrays;

public class PermMissingElem {
	public int solution(int[] A) {

		if (A.length == 0) {
			return 1;
		}

		Arrays.sort(A);

		if (A[0] != 1) {
			return 1;
		}

		for (int i = 1; i < A.length; i++) {
			if (A[i] - A[i - 1] != 1) {
				return A[i] - 1;
			}
		}

		return A.length + 1;
	}
}
