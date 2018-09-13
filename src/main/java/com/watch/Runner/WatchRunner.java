package com.watch.Runner;

import com.watch.AngleCalculation.AngleBetweenArrowsCalculation;
import com.watch.input.InitialData;

public class WatchRunner {

	public static void main(String[] args) {
		
		InitialData time = new InitialData();

		AngleBetweenArrowsCalculation angle = new AngleBetweenArrowsCalculation(time.readTime());

		System.out.println("The angle between the arrows: " + angle.getAngleBetweenArrows());

	}

}
