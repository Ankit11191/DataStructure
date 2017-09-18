package com.java2novoice.interview.programs;

import java.util.Scanner;

public class PrimeNumber {
	
	public boolean prime(int a) 
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter a number to check");
		int a=scanner.nextInt();
		PrimeNumber number= new PrimeNumber();
		System.out.println(number.prime(a));
	}
}

