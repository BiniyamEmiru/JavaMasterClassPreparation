package com.biniyam.section4.primitiveValue;

public class Primitive1MainApp {

	public static void main(String[] args) {
		byte myByte = 2;
		short myShortValue = 3;
		int myIntValue = 5;
		long myLongValue = (long) (5000 + 10 * (myByte + myIntValue + myShortValue));
		System.out.println("My long value is = " + myLongValue);
	}

}
