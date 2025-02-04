package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Batch {

	@Autowired
	private Marks marks;
	
	public void batchName() {
		System.out.println("We are in batch method");
	}
}


/*
  	@Component:- to create an object
 
	@Controller extends @Component
	@Service extends @Component
	@Repository extends @Component
*/

