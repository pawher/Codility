package CyclicRotation;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {

		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			result[(K + i) % A.length] = A[i];
		}
		
		return result;
	}
}
