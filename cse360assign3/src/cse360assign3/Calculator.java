package cse360assign3;
/** Calculator class for assignment 3.
 * @author Jorge Roldan
 *
 */


public class Calculator {

	private int total; // private int that keeps track of total
	
	/** Constructor class for Calculator
	 * @param none
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns total
	 * @param none
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	/** Adds parameter value to the total
	 * @param value
	 * @return none
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/** Subtracts parameter value to the total
	 * @param value
	 * @return none
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** Multiplies parameter value to the total
	 * @param value
	 * @return none
	 */
	public void multiply (int value) {
		total = total*value;
	}
	
	/** Divides the total by the parameter value. If value is 0, set total to 0.
	 * @param value
	 * @return none
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/** Returns empty string
	 * @param none
	 * @return ""
	 */
	public String getHistory () {
		return "";
	}
}