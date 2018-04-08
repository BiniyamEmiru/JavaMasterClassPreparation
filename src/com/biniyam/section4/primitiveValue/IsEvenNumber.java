package com.biniyam.section4.primitiveValue;

public class IsEvenNumber {

	public static void main(String[] args) {
		//printEvenNumber();
		printRangeOfEvenNumber();
	}

	private static boolean isEvenNumber(int number) {
		return (number % 2 == 0 ? true : false);
	}

	/*private static void printEvenNumber() {
		int number = 1;
		boolean result = isEvenNumber(number);
		if (result) {
			System.out.println(number + " is Even number");
		} else {
			System.out.println(number + " is not Even number");
		}
	}*/

	private static void printRangeOfEvenNumber() {
		int number = 4;
		int count=0;
		int lastNumber = 20;
		while (number <= lastNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			count++;
			System.out.println(number + " is Even number");
			if(count==5){
				break;
			}
		}
		System.out.println("Total number of even number found is "+count);
		
	}
}
