package JavaProgams;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static int solution(int[] A) {
		int temp = 1;
		int N = A.length;
		Set<Integer> set = new HashSet();
		
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
			
		    if (!set.contains(i)) {
		        temp=i;
		    }
		  
		}
		return temp;
	
}

	public static void main (String[]args) {
		int array[]= {1,2,3,8};
		int temp =solution(array);
		System.out.println(temp);
		
	}
}
