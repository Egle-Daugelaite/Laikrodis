package com.watch.AngleCalculation;

import com.watch.model.Time;

public class AngleBetweenArrowsCalculation {

	private Time time;

	private double angleBetweenArrows;

	public AngleBetweenArrowsCalculation(Time time) {
		this.time = time;
	}

	public double getAngleBetweenArrows() {

		setTheSmallestAngle();

		return angleBetweenArrows;
	}

	private void setTheSmallestAngle() {

		LocationOfArrows MinArrow = new LocationOfArrows(time);
		LocationOfArrows HArrow = new LocationOfArrows(time);

		double degreeOfMinArrow = MinArrow.getDegreeOfMinArrow();
		double degreeOfHArrow = HArrow.getDegreeOfHArrow();

		if (degreeOfMinArrow >= degreeOfHArrow) {
			angleBetweenArrows = degreeOfMinArrow - degreeOfHArrow;
		} else {
			angleBetweenArrows = degreeOfHArrow - degreeOfMinArrow;
		}

		if (angleBetweenArrows >= 180) {
			angleBetweenArrows = 360 - angleBetweenArrows;
		}

	}


}
