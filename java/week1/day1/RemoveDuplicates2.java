package week1.day1;


import java.util.LinkedHashSet;

import java.util.Set;


public class RemoveDuplicates2 {


	public static void main(String[] args) {
		String a= null;

		String b= null;
		StringBuilder sb=null;
		String st = "I like mock interview as it is same as real interview";
		System.out.println(st);
		
		String[] strwords = st.split(" ");

		Set<String> ss = new LinkedHashSet<String>();

		for (int i = 0; i < strwords.length; i++) {
			ss.add(strwords[i]);
		
		}
		int size = ss.size();
	
	for (int i= 0; i< size; i++) {
		Object[] array = ss.toArray();
		 a = array[i]+ " ";
		  sb = new StringBuilder();
		 sb.append(a);
		//System.out.print(a);
		
	}
	System.out.print(sb);
		
	}

}
