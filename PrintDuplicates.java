package week3.day2.assignemnts;


import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
	
		
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> arrSet1 = new TreeSet<Integer>();
		
		for (Integer eachi : arr) {
			if(arrSet1.add(eachi))
				continue;
			else
				System.out.println(eachi);
					
		}
		
		
	}

}
