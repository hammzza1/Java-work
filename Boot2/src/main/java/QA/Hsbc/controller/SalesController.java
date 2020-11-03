package QA.Hsbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
	
	@GetMapping("/hsbc/sales")
	public String message() {
		return "Sales Department of HSBC";
		
	}
	
	
	

}
