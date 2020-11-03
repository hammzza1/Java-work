
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test ref = new Test();
				Banking(ref);
				
				HSBC hsbc=new HSBC();
				Banking(hsbc);
				
				Barclays barclays=new Barclays();
				Banking(barclays);
				
		
		

	}
	
	
	static public void Banking(BankOfEngland bankingRef) {
		bankingRef.showBalance();
		bankingRef.openAccount();
	}

}
