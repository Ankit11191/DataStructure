package com.java2novoice.interview.programs;

public class stringPalindrome {

	public String palindrome(String s) 
	{
		int len=s.length();
		String result=null;

		for(int i=len-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
				
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
