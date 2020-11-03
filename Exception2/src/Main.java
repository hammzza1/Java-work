
public class Main {
	
	public static void main(String[] args) {
		String num1,num2;
		float result;
		
		num1="50";
		num2="0";
		
		try {
			result= Integer.parseInt(num1) / Integer.parseInt(num2);
			System.out.println("Result is"+result);
			
		}
		
		catch(NumberFormatException ref1) {
			System.out.println("Only digits can be used in operations");
			
		}
		
		catch(ArithmeticException ref2) {
			System.out.println("Cant divide anything by 0");
			
		}
		
		catch(Exception ref) {
			System.out.println("Something went wrong");
			
		}
	}

}
