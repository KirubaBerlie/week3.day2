package week3.day2.assignemnts;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementsInArray {

	public static void main(String[] args) {
		
		Integer[] arr1 = {1,2,3,4,7,6,9};
		
		Set<Integer> set1= new TreeSet<Integer>();
		set1.addAll(Arrays.asList(arr1));
		int i=1;
		
		for (Integer int1 : set1) {
		
			if(i==int1)
				{i=i+1;
				continue;}
			else
				{System.out.println(i);
				i=i+2;
				}
		}
		
		

	}

}
