package com.biniyam.section4.primitiveValue;

public class SwitchStatmentExample {

	public static void main(String[] args) {
		Character charValue='c';
		
		switch(Character.toUpperCase(charValue)){
		case 'A':
			System.out.println("It was A");
			break;
		case 'B':
			System.out.println("It was B");
			break;
		case 'C':
			System.out.println("It was C");
			break;
		default:
			System.out.println("It was not A or B or C or D");
			break;
		}
	}
	

}
