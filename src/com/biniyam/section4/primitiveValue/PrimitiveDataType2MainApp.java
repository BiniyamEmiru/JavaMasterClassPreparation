package com.biniyam.section4.primitiveValue;

public class PrimitiveDataType2MainApp {

	public static void main(String[] args) {
		// create pound valraibale
		double pound=200;
		double killogram=(pound*0.45359237);
		System.out.println(pound+" of pound is equal to "+ killogram+ " of killogram");
		char myChar='\u00ae';
		System.out.println(myChar);
		String numberString="12";
		int number=Integer.parseInt(numberString)+2;
		System.out.println("my number= "+number+myChar);
	}

}
