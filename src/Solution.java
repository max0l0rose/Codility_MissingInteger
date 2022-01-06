import java.util.Arrays;

public class Solution {
	public int solution(int[] A) {
		//A = Arrays.stream(A).sorted().distinct().toArray();
		Arrays.sort(A);
		int c = 1;
		for (int i = 0; i < A.length; i++) {
			if (i>0 && A[i] == A[i-1])
				continue;
			if (A[i]>0) {
				if (A[i] != c)
					return c;
				c++;
			}
		}
		return c;
	}
}
