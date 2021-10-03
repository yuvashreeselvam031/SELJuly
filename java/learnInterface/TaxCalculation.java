package learnInterface;

public interface TaxCalculation {

	/**
	 * this method add all the income
	 * 
	 * @param name
	 * @param amt1
	 * @param amt2
	 * @return
	 */
	public double incomeAdd(String name, double amt1, double amt2);

	/**
	 * this method is for reduction
	 * 
	 * @param name
	 * @param amt1
	 * @param amt2
	 * @return
	 */

	public double incomeReduce(String name, double amt1, double amt2);

	/**
	 * 
	 */

	public void publishValue();

	public void taxSlab(int data);
	
	 
}
