package com.watch.model;

public class Time {
	
	private int h;
	private int min;
	
	
	public Time(int h, int min) {
		this.setH(h);
		this.setMin(min);
		
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	
	

}
