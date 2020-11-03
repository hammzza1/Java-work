/*
 * This is the handling of exceptions
 */

public class EntryPoint {

	public static void main(String[] args) {

		int num1,num2;
		num1=10;
		num2=1;
		
	try {	
		int results=num1/num2;
		
		System.out.println("The results are:"+ results);
		System.out.println("Hello");
		System.out.println("my");
		System.out.println("friends");
		
	
	}
	
	catch (NumberFormatException ref1) {
		System.out.println("can do the conversion");
		
	}
	
	catch (ArithmeticException ref2) {
		System.out.println("You are not allowed to divide anything by 0");
	}
	
	System.out.println("Hello my friends");

}
}
