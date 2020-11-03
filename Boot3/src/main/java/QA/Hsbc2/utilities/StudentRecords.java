package QA.Hsbc2.utilities;

import java.util.ArrayList;

import java.lang.*;

import org.springframework.stereotype.Service;

import QA.Hsbc2.entities.Student;

@Service
public class StudentRecords {
	
	ArrayList <Student> list= new ArrayList<Student>();
	
	public StudentRecords() {
		
		Student stu1=new Student();
		stu1.regno=102;
		stu1.name="shafeeq";
		stu1.marks=149;
			
		list.add(stu1);
	}
	
	public ArrayList<Student> showStudents(){
		
		return list;
		
	}
	
	public void addrecord(Student st) {
		list.add(st);
	}
	
	public ArrayList<Student> findStudents(){
		if (employees.contains("name")) {
			
		}
	}
}
