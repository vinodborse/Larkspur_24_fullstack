package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/dt") //localhost:8080/web-app/dt (GET)
	public String data() {
		return "Hello User";
	}
	
	@GetMapping("/ext") //localhost:8080/web-app/ext (GET)
	public String extra() {
		return "BYE USER";
	}

}


//GET -> doGet			@GetMapping
//POST -> doPost			@PostMapping
//PUT  -> doPut			@PutMapping
//DELETE -> doDelete		@DeleteMapping