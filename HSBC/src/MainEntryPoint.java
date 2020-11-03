
public class MainEntryPoint {

	public static void main(String[] args) {
		
		Accounts salesdepartment= new Accounts();
		Accounts ITdepartment=new Accounts();
		
		try {
		salesdepartment.SalarySlip("shafeeq", 1000, 12);
		}
		catch(AbsentiesException E) {
			System.out.println("Please send me the report");
			
		}
		
		try {
		      ITdepartment.SalarySlip("Ali", 50000, 12);
		}
		catch (AbsentiesException E) {
			System.out.println("No its fine");
			
		}
	}
}
