package if_else;

import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		// first approach for the problem
		
//		if (a>=b && a>=c) {
//			System.out.println("a is largest");
//		}
//		else {
//			if (b>=c && b>=a) {
//				System.out.println("b is largest");
//			}
//			else {
//				System.out.println("c is largest");
//			}
//		}
		
		// Second approach for the same problem
		
		if (a>=b && a>=c) {
			System.out.println(a);
		}
		else if (b>=a && b>=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
