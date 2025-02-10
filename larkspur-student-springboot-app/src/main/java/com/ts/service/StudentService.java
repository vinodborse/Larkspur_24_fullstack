package com.ts.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	public Student addStudent(Student std) {
		Student result =  sr.save(std);
		return result;
	}

	public Student getStudent(Long rollno) {
		
		Optional<Student> std = sr.findById(rollno);
		
		Student result = new Student();
		
		if(std.isPresent()) {
			result = std.get();
		} 
		return result;
	}
}
