package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PractiseRestController {
	
	
	@RequestMapping(value="/getValues", method=RequestMethod.GET, produces="application/json")
	public Values getValues(@RequestParam("first") int first, @RequestParam("second") int second ) {
		
		int ans=0;
		
		ans = first + second;
		
		System.out.println(ans);
				
		return new Values(first, second, ans);
		
	}
	
	

	
}
