package QA.Hsbc2.controllor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.Hsbc2.entities.Student;
import QA.Hsbc2.utilities.StudentRecords;

@RestController
public class StudentController {
	
	@Autowired
	StudentRecords sturef;
	
	@GetMapping("/showallstudents")
	public ArrayList<Student> showStudents(){
		return sturef.showStudents();
	}
	
	@GetMapping("/saverecord/{regno}/{name}/{marks}")
	public String saverecord(@PathVariable("regno") int regno1,
							@PathVariable("name") String name1, 
							@PathVariable("marks") int marks1) {
		
		Student ref= new Student();
		ref.regno=regno1;
		ref.name=name1;
		ref.marks=marks1;
		
		sturef.addrecord(ref);
		return "Record Saved";
		
	}
			
	@GetMapping("/findrecord/{name}")
	public ArrayList<Student> findStudent(@PathVariable("name")){
		
	}
	
}
