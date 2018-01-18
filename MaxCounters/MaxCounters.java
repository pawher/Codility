package MaxCounters;

import java.util.Arrays;

public class MaxCounters {

	// The score is: correctness 100%, but performance 60%

	public int[] solution(int N, int[] A) {

		int[] tab = new int[N];
		int max = 0;
		int temp = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				tab[A[i] - 1] = tab[A[i] - 1] + 1;
				temp = tab[A[i] - 1];
				if (temp > max) {
					max = temp;
				}

			} else if (A[i] == N + 1) {
				Arrays.fill(tab, max);
			}
		}
		return tab;
	}
}
