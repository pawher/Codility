package PermCheck;

import java.util.Arrays;

public class PermCheck {

	public int solution(int[] A) {

		Arrays.sort(A);
		if (A[0] != 1 || A[A.length - 1] != A.length) {
			return 0;
		}

		for (int i = 1; i < A.length - 1; i++) {
			if (A[i + 1] - A[i] != 1) {
				return 0;
			}
		}
		return 1;
	}
	
	//  ---- with Java 8, but score is: Correctness 100%, Performance 83%
	public int solutionWithJava8(int[] A) {
		
		Arrays.sort(A);
		if (A[0] != 1 || A[A.length - 1] != A.length) {
			return 0;
		}
		
		return Arrays.stream(A).distinct().count() == A.length? 1:0;
	}

}
