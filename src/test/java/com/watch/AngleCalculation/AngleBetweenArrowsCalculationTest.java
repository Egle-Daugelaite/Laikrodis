package com.watch.AngleCalculation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AngleBetweenArrowsCalculationTest {

	private AngleBetweenArrowsCalculation angleCalculation;
	private double correctAngle;

	@Before
	public void setUp() {
		double degreesOfMinArrow = 147.5;
		double degreesOfHArrow = 330;
		angleCalculation = new AngleBetweenArrowsCalculation(degreesOfMinArrow, degreesOfHArrow);
		correctAngle = 360 - (330 - 147.5);

	}

	@Test
	public void getAngleBetweenArrows() {

		double angle = angleCalculation.getAngleBetweenArrows();
		assertEquals(correctAngle, angle, 0);

	}

}
