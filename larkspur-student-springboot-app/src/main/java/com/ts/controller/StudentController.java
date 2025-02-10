package com.ts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student std) {
		
		Student stdResult = ss.addStudent(std);
		
		return stdResult;
	}
	
	@GetMapping("/get-student")
	public Student getStudent(@RequestParam("rn") Long rollno) {
		Student studentResult = ss.getStudent(rollno);
		return studentResult;
	}
	
}











