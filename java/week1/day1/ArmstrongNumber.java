package week1.day1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		String ss = sc.nextLine();
		
		int num = Integer.parseInt(ss);
		//System.out.println("the given num" +num);
		
		int sum =0;
		int num2 = num;
		
		String valueOfnum = String.valueOf(num);
		int length = valueOfnum.length();
		
		while (num>0) {
		  int reminder = num % 10;
			int quotient = num / 10;
		//	sum = sum + reminder * reminder * reminder;
			
			 sum = sum + (int)Math.pow(reminder,length);
			
			
			num = quotient;
			
	}
		if (sum==num2) {
			System.out.println("sum= " +sum);
			System.out.println("The number " + num2 + " is a Armstrong number");
		
			
		}
		else {
			System.out.println("sum= " +sum);
			System.out.println("The number " + num2 + " is not a Armstrong number");
		}
		
	
}
}
