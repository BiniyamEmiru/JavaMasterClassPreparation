package com.biniyam.section4.primitiveValue;

public class MethodOcerloadingExamppleMainApp {

	public static void main(String[] args) {
		// double centmeter1 = calcFeetAndInchesToCentemeter(6, 2.5);

		double centmeter2 = calcFeetAndInchesToCentemeter(157);
		if (centmeter2 < 0) {
			System.out.println("invalid parmater");
		}
	}

	private static double calcFeetAndInchesToCentemeter(double feet, double inches) {
		if ((feet >= 0) || (inches >= 0 || inches <= 12)) {
			double centemeter = feet * 12;
			centemeter = (centemeter + inches) * 2.54;
			System.out.println(feet + " foot " + "and " + inches + " inchees is " + centemeter + " cm");
			return centemeter;
		}
		return -1;
	}

	private static double calcFeetAndInchesToCentemeter(double inches) {
		if (inches >= 0) {
			int feet = (int) inches / 12;
			double remaingInchess = inches % 12;
			return calcFeetAndInchesToCentemeter(feet, remaingInchess);
		}
		return -1;
	}
}
