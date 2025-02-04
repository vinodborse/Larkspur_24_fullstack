package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Batch batch;
	
	@Autowired
	private Marks mr;

	public void data() {
		System.out.println("We are in student's method");
		batch.batchName();
		mr.englishMarks();
	}
	
	
}
