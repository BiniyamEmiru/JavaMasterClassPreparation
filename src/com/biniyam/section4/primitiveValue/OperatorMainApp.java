package com.biniyam.section4.primitiveValue;

public class OperatorMainApp {

	public static void main(String[] args) {
		double doubleValue1=20;
		double doubleValue2=80;
		double multiplyValue=(doubleValue1+doubleValue2)*25;
		int remiderValue=(int) (multiplyValue%40);
		if(remiderValue<=20)
			System.out.println("total was over the limit");
	}

}
