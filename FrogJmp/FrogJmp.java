package FrogJmp;

public class FrogJmp {
	
	public int solution(int X, int Y, int D) {

		int distance = Y - X;
		return distance % D == 0 ? distance / D : distance / D + 1;
	}
}
