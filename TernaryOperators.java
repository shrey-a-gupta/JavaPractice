package basics;

public class TernaryOperators {

	public static void main(String[] args) {
			int numOne = 10;
			int numTwo = 5;
			int min = (numOne < numTwo) ? numOne : numTwo;
			System.out.println(min); //Output will be 5
		}

}

/*Here, first the condition (numOne < numTwo) is evaluated. 
 * The result is false and hence, min will be assigned the value numTwo. 
 */