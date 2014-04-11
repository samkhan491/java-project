package com.Arrays;

public class SumAnndAverage {

	public static void main(String[] args) {
		
		int sum = 0;
		double average;
		
		int lowerbound=1;
		int upperbound=100;
		
		
		
		for(int number=lowerbound; number<=upperbound;++number){

			sum +=number;
	
			System.out.println("The sum is:" +sum );
		
			average=sum/100;
			System.out.println("the average is :" +average);
		}
		
		
		
	}
}