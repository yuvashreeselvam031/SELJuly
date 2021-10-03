package week1.day1;

public class LearnForAndIf {
	public static void main(String[] args) {
			//problem statement = to print all the even numbers between 1 and 50
		System.out.println("all even and odd numbers from 1 to 50");
		System.out.println(" even numbers ");
		for (int i = 1; i < 50; i++) {
			if (i%2==0) {
				
				System.out.println(i);
			}
			
		}
		System.out.println(" odd numbers ");
		for (int i = 0; i < 50; i++) {
			if (i%2!=0) {
				
				System.out.println(i);
			}
			
		}
		System.out.println("end for loop");
	}

}
