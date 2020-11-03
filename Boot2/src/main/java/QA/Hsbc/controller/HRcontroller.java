package QA.Hsbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRcontroller {
	
	@GetMapping("/hsbc/hr")
	public String aboutus2() {
		return "HR department of HSBC";
	}

}
