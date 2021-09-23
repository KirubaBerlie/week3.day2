package week3.day2.assignemnts;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet1j {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] strArray = new String(text).split(" ");
		Set<String> strSet = new LinkedHashSet<String>();
	 
		strSet.addAll(Arrays.asList(strArray));
		
		
		for (String st1 : strSet) {			
			System.out.println(st1);
			
		}
		
	 
		
		
		
	}

}
