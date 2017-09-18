package com.java2novoice.interview.programs;

import java.util.Arrays;

public class QuickSort 
{
	int[] arr;
	int length;
	public int[] sort(int[] input) 
	{
		this.arr=input;
		length=input.length;
		doSort(0,length-1);
		return input;
	}
	
	public void doSort(int lowIndex,int highindex)
	{
		int i=lowIndex;
		int j=highindex;
		int pi=lowIndex+(highindex-lowIndex)/2;
		int pivot=arr[pi];
		System.out.println("pivot : "+pivot+"/ pivot index : "+pi+"/ high index : "+highindex+"/ low index : "+lowIndex+"/ i=lowIndex : "+i+"/ j=highindex : "+j);
		while (i <= j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(lowIndex<j)
		{
			doSort(lowIndex,j);
		}
		if(i<highindex)
		{
			doSort(i, highindex);
		}
	}
	public static void main(String[] args) 
	{
		int[] input={9,8,9,7,9,6,5,4,9,9,9,4,4,4,3,2,1};//,3,2,4,5,6,8,9,9,9,3,5//1,4,7,9,3,7,22,2,3
		System.out.println("input IS:  "+Arrays.toString(input));
		QuickSort quickSort=new QuickSort();
		int[] output = quickSort.sort(input);
		
		System.out.println("Output IS: "+Arrays.toString(output));
		
	}
}
