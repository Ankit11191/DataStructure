package com.java2novoice.interview.programs;

public class NumberReverse {

	public int reverse(int number)
	{
		int num=0;
		while(number!=0)
		{
			num=num*10+number%10;
			number=number/10;
		}
		return num;
	}
	
	public static void main(String[] args) {
	NumberReverse numberReverse=new NumberReverse();
	System.out.println(numberReverse.reverse(1234561));
	
		
	}

}
