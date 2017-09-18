package com.java2novoice.interview.programs;

public class DuplicateNumbers {

	public int duplicate(int[] number)
	{
		int high=number.length-1;
		int total=getsum(number);
		int DuplicateNumber=total-(high*(high+1)/2);
		return DuplicateNumber;
	}
	
	public int getsum(int[] sum1)
	{
		int sum=0;
		for(int i:sum1)
		{
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int max=31;
		int[] num=new int[max];
		for(int i=0;i<max;i++)
		{
			num[i]=i;
		}
		num[22]=22;
		DuplicateNumbers duplicateNumbers=new DuplicateNumbers();
		System.out.println(duplicateNumbers.duplicate(num));
	}
}