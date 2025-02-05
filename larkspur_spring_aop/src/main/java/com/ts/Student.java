package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	Teacher tch;
	
	public void studentData() {
		System.out.println("We are using studentData method");
		tch.teacherData();
	}
}
