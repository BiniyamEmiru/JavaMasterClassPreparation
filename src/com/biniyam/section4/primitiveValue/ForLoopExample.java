package com.biniyam.section4.primitiveValue;

public class ForLoopExample {

	public static void main(String[] args) {
		// calculate();

		noOfPrimeNumber();
	}

	private static void calculate() {
		double amount = 10_000;
		for (int i = 2; i < 9; i++) {
			System.out.println(amount + "at " + i + " interste rate is: "
					+ String.format("%.2f", calculateIntersetRate(amount, i)));
		}
	}

	private static double calculateIntersetRate(double amount, double rate) {
		return (amount * (rate / 100));
	}

	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	private static void noOfPrimeNumber() {
		int count = 0;
		for (int j = 1; j <= 3; j++) {
			if (isPrime(j)) {
				System.out.println(j + " is prime number");
				count++;
				
			}
			if (count == 10) {
				break;
			}

		}

	}
}
