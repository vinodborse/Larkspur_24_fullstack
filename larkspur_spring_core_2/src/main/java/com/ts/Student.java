package com.ts;


public class Student {

	private Batch batch;
	
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}


	public Student() {} 
	
	public Student(Batch batch) {
		this.batch = batch;
	}
	public void data() {
		System.out.println("We are in student's method");
		batch.batchName();
	}
	
	
}
