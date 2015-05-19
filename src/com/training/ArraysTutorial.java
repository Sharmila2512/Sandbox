package com.training;

public class ArraysTutorial {

	private static String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h",
			"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
			"v", "w", "x", "y", "z" };
	

	public static void printUpperAndLowerCase() {
		
		for (int i = 0; i < letters.length; i++) {
			String str = letters[i];
			System.out.println(" " + str.toUpperCase() + str);
		}
	}

	public static void printName() {
		
		StringBuilder str = new StringBuilder();

		str.append(letters[18].toUpperCase()).append(letters[7])
				.append(letters[0]).append(letters[17]).append(letters[12]).append(letters[8])
				.append(letters[11]).append(letters[0]);

		System.out.println("My name is " + str);

	}

	public static void main(String[] args) {

		printUpperAndLowerCase();
		printName();

	}

}
