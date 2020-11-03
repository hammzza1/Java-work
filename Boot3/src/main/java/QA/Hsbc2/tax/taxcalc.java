package QA.Hsbc2.tax;

import org.springframework.stereotype.Service;

@Service
public class taxcalc {
	
	public float Tax (int salary) {
		if (salary < 1000) {
			return 0;}
		if ( 1000<=salary && salary <2000) {
			return (float)salary*15/100;}
		else {
			return (float)salary*25/100;}
		}

}
