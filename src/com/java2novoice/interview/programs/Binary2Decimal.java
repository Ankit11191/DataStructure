package com.java2novoice.interview.programs;

public class Binary2Decimal 
{
	public int decimal(int number) 
	{
		int deci=0;
		int p=0;
		while(true)
		{
			if(number==0)
			{
				break;
			}
			else
			{
				int temp=number%10;
				deci+=(int) (temp*Math.pow(2, p));
				number=number/10;
				p++;
			}
		}
		return deci;
	}
	public static void main(String[] args) {
		Binary2Decimal decimal2Binary=new Binary2Decimal();
		int result= decimal2Binary.decimal(110010);
		System.out.println(result);
	}
}
