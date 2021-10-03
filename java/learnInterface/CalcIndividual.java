package learnInterface;

public class CalcIndividual implements TaxCalculation,AnotherInterface {

	public double incomeAdd(String name, double amt1, double amt2) {
		// TODO Auto-generated method stub
		System.out.println("name of the indivdual:" +name);
		double result = amt1 + amt2;
		
		return result;
	}

	public double incomeReduce(String name, double amt1, double amt2) {
		// TODO Auto-generated method stub
		System.out.println("name of the indivdual:" +name);
		double result = amt1 - amt2;
		
		return result;
		
	}

	public void publishValue() {
		// TODO Auto-generated method stub
		
	}

	public void taxSlab(int data) {
		// TODO Auto-generated method stub
		
	}

	public int add(int a, int b) {
		int sum = a + b;
		
		return 0;
	}

	public void sub(int a, int b) {
		int sub = a -b;
		//return sub;
		// void method cannot have return type it does not return any value
		System.out.println(sub);
	}
	
	
	
	

}
