package com.training;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
	
	static double height=0.0;
	static double weight=0.0;
	static double bmi=0.0;
	static double pound = .453592;
	static double inches = 2.54;
	private static Scanner scan;
	

	/*public static void main (String[] args){
		
		scan = new Scanner(System.in);
		System.out.println("Enter in your weight: ");
		weight = scan.nextDouble();
		System.out.println("Enter in your height: " );
		height = scan.nextDouble();
		weight = weight * pound ;// Converts pounds to kilograms
		height = height * inches ;// Converts inches to centimeters
		double BMI = weight/(height*height);// Computes users BMI
		DecimalFormat fmt = new DecimalFormat("0.00");// Rounds answer to 2 decimal places.
		System.out.println("Your Body Mass Index is: " + fmt.format(BMI));
		
	}*/
	
	public double getBMI(){
		scan = new Scanner(System.in);
		System.out.println("Enter in your weight: ");
		weight = scan.nextDouble();
		System.out.println("Enter in your height: " );
		height = scan.nextDouble();
		weight = weight * pound ;// Converts pounds to kilograms
		height = height * inches ;// Converts inches to centimeters
		double BMI = weight/(height*height);// Computes users BMI
		//DecimalFormat fmt = new DecimalFormat("0.00");// Rounds answer to 2 decimal places.
		//System.out.println("Your Body Mass Index is: " + fmt.format(BMI));
		 return BMI;
		
	}
}
