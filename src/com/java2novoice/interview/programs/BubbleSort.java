package com.java2novoice.interview.programs;

import java.util.Arrays;

public class BubbleSort {

	public int[] bSort(int[] input)
	{
		int i=input.length;
		int j;
		for(int m=i;m>=0;m--)
		{
			for(int n=0;n<i-1;n++)
			{
				j=n+1;
				if(input[n]>input[j])
				{
					int temp=input[n];
					input[n]=input[j];
					input[j]=temp;
				}
			}
		}
		return input;
	}
	
	public static void main(String[] args) 
	{
		int[] arr={1,3,2,2,2,3,4,5,4,3,2};
		BubbleSort bs=new BubbleSort();
		int[] output=bs.bSort(arr);
		System.out.println(Arrays.toString(output));
	}

}
