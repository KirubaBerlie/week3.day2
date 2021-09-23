package week3.day2.assignemnts;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetFindIntersection {

	public static void main(String[] args) {
	
		Integer[] intArr1 = {3,2,11,4,6,7};
		Integer[] intArr2 = {1,2,8,4,9,7};
		Set<Integer> setInt1 = new LinkedHashSet<Integer>();
		Set<Integer> setInt2 = new LinkedHashSet<Integer>();	
		
		setInt1.addAll(Arrays.asList(intArr1));
		setInt2.addAll(Arrays.asList(intArr2));
		
		setInt1.retainAll(setInt2);
		System.out.println(setInt1);
		

	}

}
