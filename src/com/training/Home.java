package com.training;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Home {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out
				.println("Press B to know your BMI and H to know your heart rate");

		String input = scan.next();

		if (input.equalsIgnoreCase("h")) {
			HeartRate heartRate = new HeartRate();
			heartRate.getHeartRate();

		}

		else if (input.trim().equalsIgnoreCase("b")) {
			System.out.println("inside bmi");
			BMICalculator bmiCalculator = new BMICalculator();
			double BMI = bmiCalculator.getBMI();
			DecimalFormat fmt = new DecimalFormat("0.00");
			System.out.println("Your Body Mass Index is: " + fmt.format(BMI));

		}

	}
}
