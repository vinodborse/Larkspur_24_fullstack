package com.ts;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class EmployeeControler {

	@DeleteMapping("/dept")
	public String deptName() {
		return "IT, ADMIN";
	}
}
