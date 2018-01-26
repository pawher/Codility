package PassingCars;

public class PassingCars {

	public int solution(int[] A) {

		int east = 0;
		int result = 0;

		for (int i : A) {
			if (i == 0) {
				east++;
			} else {
				result = result + east;
				if (result > 1000000000) {
					return -1;
				}
			}
		}
		return result;
	}
}
