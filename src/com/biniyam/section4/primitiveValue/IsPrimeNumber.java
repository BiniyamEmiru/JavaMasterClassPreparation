package com.biniyam.section4.primitiveValue;

public class IsPrimeNumber {

	public static void main(String[] args) {
		PrintPrimeNumber();
	}

	private static void PrintPrimeNumber() {
		boolean result;
		int count = 0;
		for (int j = 1; j <= 50; j++) {
			result = isPrime(j);
			if (result) {
				count++;
				System.out.println(j + " is a prime number");
			}
			if (count == 20) {
				break;
			}
		}

	}

	private static boolean isPrime(int num) {
		// int count=0;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;

	}
}