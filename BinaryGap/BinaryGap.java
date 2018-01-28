package BinaryGap;

public class BinaryGap {

	public int solution(int N) {

		int max = 0;
		int count = 0;

		while ((N & 1) == 0) {
			N = N >> 1;

		}

		while (N != 0) {
			if ((N & 1) == 1) {
				count = 0;
			} else {
				count++;
				if (max < count) {
					max = count;
				}

			}
			N = N >> 1;
		}
		return max;
	}
}
