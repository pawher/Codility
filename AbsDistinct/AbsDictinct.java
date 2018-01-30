package AbsDistinct;

//import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AbsDictinct {
	
	public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        
		for(int i=0; i<A.length; i++) {
			if(A[i] < 0) {
				set.add(Math.abs(A[i]));
			} else {
				set.add(A[i]);
			}
		}
		
		return set.size();
		
		//Arrays.stream(A).map(x-> Math.abs(x)).distinct().count();

    }

}
