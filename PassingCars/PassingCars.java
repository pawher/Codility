package PassingCars;

public class PassingCars {

	final static int MAX = 1000000000;
	
	public int solution(int[] A) {

		int east = 0;
		int result = 0;

		for (int i : A) {
			if (i == 0) {
				east++;
			} else {
				result = result + east;
				if (result > MAX) {
					return -1;
				}
			}
		}
		return result;
	}
}
