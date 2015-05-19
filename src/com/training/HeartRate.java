package com.training;

import java.util.Scanner;

public class HeartRate {
	
	private static Scanner scan;
	
	public void getHeartRate(){
		
		scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scan.nextInt();
		int maxHeartRate=220-age;
		double minHeartRate=maxHeartRate*0.5;
		System.out.println("Your maximum heart rate is:" +maxHeartRate);
		System.out.println("Your minimum heart rate is:" +minHeartRate);
	}

}
