package week1.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Convertion {
	

	public static void main(String[] args) {
		List<String> s = null;
		int num= 973487;
		
		String valueOf = String.valueOf(num);
	
		System.out.println(valueOf);
		
		char[] charArray = valueOf.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		System.out.println(valueOf.replaceAll("[\\d]", " "));
		System.out.println(valueOf.replaceAll("[\\D]", " "));
		System.out.println("**********************************");
				
		String i = "i am a very good programmer also i am a thinker";
		
		String[] split = i.split(" ");
		for (int j = 0; j < split.length; j++) {
			
			s.add(split[j]);
		}

		int size = s.size();
		for (int k = 0; k < size; k++) {
			System.out.println();
			
		}
		
		
		
	}

}
