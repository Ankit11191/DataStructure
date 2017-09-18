package com.java2novoice.interview.programs;

import java.util.Arrays;

public class removeDuplicateFromSortedArray {

	public int[] removeDuplicate(int[] input) 
	{
		int j = 0;
        int i = 1;
        if(input.length < 2)
        {
            System.out.println(input[0]);
        }
        while(i<input.length)
        {
        	if(input[i]==input[j])
        	{
        		i++;
        	}
        	else
        	{
        		input[++j]=input[i++];
        	}
        }

        int[] output= new int[j+1];
        for(int l=0;l<output.length;l++)
        {
        	output[l]=input[l];
        }
        return output;
	}

	public static void main(String[] args) 
	{
		int[] arr={1,4,3,2,33,2,32,32,3,3,3,3,3,3};
		//System.out.println(arr.length);
		Arrays.sort(arr);
		removeDuplicateFromSortedArray array=new removeDuplicateFromSortedArray();
		int [] output = array.removeDuplicate(arr);
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
	}
}