import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		String z = s.nextLine();
		System.out.println(z);
		
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		
		int si = (p * r * t)/100;
		
		System.out.println(si);
		
		
		// Use of Scanner with different datatypes
		
		int a = s.nextInt();
		float b = s.nextFloat();
		long c = s.nextLong();
		double d = s.nextDouble();
		short e = s.nextShort();
		
		// for char, we donot use nextChar.....it is invalid
		char o = z.charAt(0);
	}

}
