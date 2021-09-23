package week3.day2.assignemnts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
;


public class FindSecondLargest {

	public static void main(String[] args) {
		
		
		Integer[] intArr1 =  {3,2,11,4,6,7};
		Set<Integer> setInt1 = new TreeSet<Integer>();
		setInt1.addAll(Arrays.asList(intArr1));

		List<Integer> intList = new ArrayList<Integer>(setInt1);
		System.out.println(intList.get(intList.size()-2));
		
			
	}

}
