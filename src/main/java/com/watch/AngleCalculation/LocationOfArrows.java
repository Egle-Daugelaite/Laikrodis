package com.watch.AngleCalculation;

import com.watch.model.Time;

public class LocationOfArrows {
	
	private static final int DEGREES_OF_ONE_MIN = 6;
	private static final int DEGREES_OF_ONE_H = 30;
	private static final double DEGREES_OF_H_IN_ONE_MIN = 0.5;
	

	private Time time;
	private double degreeOfMinArrow;
	private double degreeOfHArrow;

	public LocationOfArrows(Time time) {
		this.time = time;
	}

	public double getDegreeOfMinArrow() {
		
		degreeOfMinArrow = time.getMin() * DEGREES_OF_ONE_MIN;

		return degreeOfMinArrow;

	}

	public double getDegreeOfHArrow() {
		
		int degreesOfFullHours;
		double degreesOfNotFullHours;

		degreesOfFullHours = time.getH() * DEGREES_OF_ONE_H;
		degreesOfNotFullHours = DEGREES_OF_H_IN_ONE_MIN * time.getMin();
		degreeOfHArrow = degreesOfFullHours + degreesOfNotFullHours;

		return degreeOfHArrow;

	}


}
