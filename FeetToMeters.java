/*
 * Problem 2.3 Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.
*/

import java.util.Scanner;

public class FeetToMeters {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a height in feet");
		double heightFeet = keyboard.nextDouble();
		double heightMeters = heightFeet * 0.305;
		System.out.println(heightFeet + " feet is " + heightMeters + " meters");
	}
}
