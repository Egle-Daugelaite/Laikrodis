package com.watch.AngleCalculation;

import com.watch.model.Time;

public class LocationOfArrows {
	
	private static final int DEGREES_OF_ONE_MIN = 6;
	private static final int DEGREES_OF_ONE_H = 30;
	private static final double DEGREES_OF_H_IN_ONE_MIN = 0.5;
	

	private Time time;
	private double degreesOfMinArrow;
	private double degreesOfHArrow;

	public LocationOfArrows(Time time) {
		this.time = time;
	}

	public double getDegreesOfMinArrow() {
		
		degreesOfMinArrow = time.getMin() * DEGREES_OF_ONE_MIN;

		return degreesOfMinArrow;

	}

	public double getDegreesOfHArrow() {
		
		int degreesOfFullHours;
		double degreesOfNotFullHours;

		degreesOfFullHours = time.getH() * DEGREES_OF_ONE_H;
		degreesOfNotFullHours = DEGREES_OF_H_IN_ONE_MIN * time.getMin();
		degreesOfHArrow = degreesOfFullHours + degreesOfNotFullHours;

		return degreesOfHArrow;

	}


}
