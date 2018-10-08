package com.watch.Runner;

import com.watch.AngleCalculation.AngleBetweenArrowsCalculation;
import com.watch.AngleCalculation.LocationOfArrows;
import com.watch.input.InitialData;

public class WatchRunner {

	public static void main(String[] args) {

		InitialData time = new InitialData();

		LocationOfArrows degreesOfArrow = new LocationOfArrows(time.readTime());

		AngleBetweenArrowsCalculation angle = new AngleBetweenArrowsCalculation(degreesOfArrow.getDegreesOfHArrow(),
				degreesOfArrow.getDegreesOfMinArrow());

		System.out.println("The angle between the arrows: " + angle.getAngleBetweenArrows());

	}

}
