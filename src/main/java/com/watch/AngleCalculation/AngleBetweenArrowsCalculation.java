package com.watch.AngleCalculation;

public class AngleBetweenArrowsCalculation {

	private double angleBetweenArrows;
	double degreesOfMinArrow;
	double degreesOfHArrow;

	
	public AngleBetweenArrowsCalculation(double degreesOfHArrow, double degreesOfMinArrow) {
		this.degreesOfHArrow = degreesOfHArrow;
		this.degreesOfMinArrow = degreesOfMinArrow;
	}

	public double getAngleBetweenArrows() {

		setTheSmallestAngle();

		return angleBetweenArrows;
	}

	private void setTheSmallestAngle() {

		if (degreesOfMinArrow >= degreesOfHArrow) {
			angleBetweenArrows = degreesOfMinArrow - degreesOfHArrow;
		} else {
			angleBetweenArrows = degreesOfHArrow - degreesOfMinArrow;
		}

		if (angleBetweenArrows >= 180) {
			angleBetweenArrows = 360 - angleBetweenArrows;
		}

	}


}
