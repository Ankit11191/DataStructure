package com.java2novoice.interview.programs;

import java.util.Scanner;

public class fibonacciSeries {
	
	public int[] FSeries(int number) 
	{
		int feb[]=new int[number];
		feb[0]=0; feb[1]=1;
		for(int i=2;i<number;i++)
		{
			feb[i]=feb[i-2]+feb[i-1];
		}
		
		return feb;
	}

	public static void main(String[] args) {
	fibonacciSeries fibonacciSeries=new fibonacciSeries();
	char res;
	do{
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter numbewr: ");	
	int number=scanner.nextInt();
	int[] result =fibonacciSeries.FSeries(number);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+",");
		}
		System.out.println("What do you do next?");
        res = scanner.next().charAt(0);
	}while(res=='y'||res=='Y');

	}

}
