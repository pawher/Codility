package Dominator;

public class Dominator {

	public static int solution(int[] A) {

		int temp = 0; 
		int size = 0; 
		int result =-1; 
		
		for(int i: A) {
			if(size == 0) {
				size++;
				temp = i;
			} else {
				if(temp != i) {
					size--;
				} else {
					size++;
				}
			}
		}
		
		int candidate = -1;
		
		if(size > 0 ) {
			candidate = temp;
		} else {
			return -1;
		}

		int count = 0; 
		int k;
		
		for (k=0; k<A.length; k++) {
			if(A[k]==candidate) {
				count++;
				result = k;
			}
		}
		
		if(count>A.length/2) {
			return result;
		} else {
			return -1;
		}
	}
}
