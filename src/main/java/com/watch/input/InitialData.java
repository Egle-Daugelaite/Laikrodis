package com.watch.input;

import java.util.Scanner;

import com.watch.model.Time;

public class InitialData {

	private Scanner scanner;
	private int h = 0;
	private int min = 0;

	public InitialData() {

	}

	public Time readTime() {

		scanner = new Scanner(System.in);

		h = readHour();
		min = readMinutes();

		Time time = new Time(h, min);

		return time;
	}

	private int readHour() {

		System.out.println("Enter hours (from 1 to 12): ");

		do {

			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number! Try again.");
				scanner.next();
			}

			h = scanner.nextInt();

			if (h < 1 || h > 12) {
				System.out.println("That's an invalid number! Try again.");
			}

		} while (h < 1 || h > 12);

		return h;
	}

	private int readMinutes() {

		System.out.println("Enter minutes (from 0 to 59): ");

		do {

			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number! Try again.");
				scanner.next();
			}

			min = scanner.nextInt();

			if (min < 0 || min > 59) {
				System.out.println("That's an invalid number! Try again.");
			}

		} while (min < 0 || min > 59);

		return min;

	}

}
