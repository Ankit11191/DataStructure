package com.java2novoice.interview.programs;

public class Decimal2Binary 
{
	public int[] binary(int number) 
	{
		int bin[]=new int[5];
		int index=0;
		while(number>0)
		{
			bin[index++]=number%2;
			number=number/2;
		}
		return bin;
	}
	public static void main(String[] args) {
		Decimal2Binary decimal2Binary=new Decimal2Binary();
		int result[]= decimal2Binary.binary(7);
		System.out.println(result.length);
		for(int i=result.length-1;i>=0;i--)
		{
			System.out.print(result[i]);
		}
	}
}
