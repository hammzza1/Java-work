
public class Exams {
	
	private int phy,che,total;
	private float per;
	String studentname;
	
	public void physics(int a) {
		if (a>=0 && a<=100) {
			phy=a;
			
		}
		else
		{
			System.out.println("Invalid physics marks");
		}
	}
	public void chemistry(int a) {
		if (a>=0 && a<=100) {
			che=a;
		}
		else
		{
			System.out.println("Invalid chemistry marks");
		}
	}
	
	public void showResults() {
		total=phy+che;
		per=(float)total*100/300;
		System.out.println("Results of " + studentname);
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage:" +per);
		
	}
	{ int A;
	for(A=1;A<=10;A=A+1) {
		System.out.println(A);
	}
	}
	

}
