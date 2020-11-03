package QA.Hsbc2.utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import QA.Hsbc2.entities.Student;

@Service
public class Records {
	
	ArrayList<String> employees=new ArrayList<String>();
	
	public Records() {
		employees.add("shafeeq");
		employees.add("Ali");
		employees.add("tony");
		employees.add("john");
		
	}
	
	public ArrayList<String> showEmployees(){
		return employees;
	
	
	}
	
	public void addRecord(String name) {
		employees.add(name);
		
	}
	public void removeRecord(String reno) {
		employees.remove(reno);
		
	}
	
	public void findStudents(){
		if (employees.contains("name")) {
			return 
			
		}
	}

}
