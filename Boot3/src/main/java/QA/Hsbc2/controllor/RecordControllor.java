package QA.Hsbc2.controllor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.Hsbc2.utilities.Records;

@RestController
public class RecordControllor {
	
	@Autowired
	Records ref;
	
	@GetMapping("/showrecords")
	public ArrayList<String> diplayallrecords() {
		return ref.showEmployees();
		
	}
	
	@GetMapping("/addrecord/{name}")
	public String addingRecord(@PathVariable("name")String na) {
		ref.addRecord(na);
		return "Record Saved";
	}

}
