package com.biniyam.section4.primitiveValue;

public class Looping {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		System.out.println("Before swapping");
		System.out.println("Num1 "+num1);
		System.out.println("Num2 "+num2);
		System.out.println("+++++++++++++++");
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After  swapping");
		System.out.println("Num1 "+num1);
		System.out.println("Num2 "+num2);
		/*int count=1;
		while(count!=7){
			System.out.println("count value is "+count);
			count++;
		}
		count=1;
		while(true){
			System.out.println("Count value is "+count);
			count++;
			if(count==7){
				break;
			}
			
		}*/
		
	}

}
