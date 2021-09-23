package week3.day2.assignemnts;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
			String str= "PayPal";
			char[] chArr = str.toCharArray();
			Set<Character>  charSet = new HashSet<Character>();
			Set<Character>  dupCharSet = new HashSet<Character>();
			
			for(int i =0; i <chArr.length; i++ )
			{
				boolean isAdd = charSet.add(chArr[i]);
				if (!isAdd)
				{
					dupCharSet.add(chArr[i]);
				}
				
			}
			
			System.out.println(charSet);
			System.out.println(dupCharSet);
			
			dupCharSet.removeAll(charSet);
			
			System.out.println(charSet);
			System.out.println(dupCharSet);
			
			for (Character character : charSet) {
				if (character!=' ')
					System.out.println(character);
					
						
				
			}
			

	}

}
