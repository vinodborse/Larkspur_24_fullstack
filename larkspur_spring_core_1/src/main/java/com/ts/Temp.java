package com.ts;

public class Temp {
	
	private Sample s;
	
	
	
	
	public Temp() {}
	
	public Temp(Sample s) {
		this.s = s;
	}

	public Sample getS() {
		return s;
	}
	public void setS(Sample s) {
		this.s = s;
	}

	public void data() {
		s.add();
	}
	
	
}
