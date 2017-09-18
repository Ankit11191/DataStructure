package com.java2novoice.interview.programs;

public class sumOfEachDigit {
	int result=0;
	public int digitSum(int number) 
	{
		if(number==0)
		{
			return result;
		}
		else
		{
			result=result+(number%10);
			number=number/10;
			digitSum(number);	
		}
		return result;
	}
	
	public static void main(String[] args) {

		sumOfEachDigit digit=new sumOfEachDigit();
		System.out.println(digit.digitSum(1234));

	}

}
