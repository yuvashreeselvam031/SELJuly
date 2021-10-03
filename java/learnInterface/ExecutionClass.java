package learnInterface;

import week1.day1.LearnIf;

public class ExecutionClass extends LearnIf{
// LearnIf class can be inherited from another package using import	
	public static void main(String[] args) {
		
		// To Execute Interface methods
		CalcIndividual indvi = new CalcIndividual();
		double addition = indvi.incomeAdd("yuva", 95000, 65472);
		System.out.println(addition);
		indvi.incomeReduce("shree", 87026,63571);
		indvi.publishValue();
		indvi.taxSlab(76);
		indvi.add(10, 05);
		indvi.sub(10, 05);
		CalcBusiness business = new CalcBusiness();
		business.taxSlab(87);
		
		
		
		
				
	}

}
