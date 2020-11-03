package QA.Hsbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/hsbc/accounts")
	public String aboutus() {
		return "Accounts Department of HSBC";
				
	}

}
