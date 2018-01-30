package Triangle;

import java.util.Arrays;

public class Triangle {

	public int solution(int[] A) {

		Arrays.sort(A);
		
		if(A.length<3 || (A.length==3 && A[0] ==0)) {
			return 0; 
		}
		
		if(A[A.length-1]==Integer.MAX_VALUE && A[A.length-2] == Integer.MAX_VALUE) {
			return 1;
		}

		for (int i = 2; i < A.length; i++) {
			if (A[i - 2] + A[i - 1] > A[i]) {
				return 1;
			}
		}

		return 0;
	}

}
