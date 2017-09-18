package com.java2novoice.interview.programs;

public class abc 
{
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		String str1="mittal.ankit91@gmail.coM";
		String str2="mittal.ankit91@gmail.com";
		
		System.out.println("1: "+str1.charAt(3));
		System.out.println("2: "+str1.codePointAt(7));
		System.out.println("3: "+str1.codePointBefore(3));
		System.out.println("4: "+str1.codePointCount(0, 15));
		System.out.println("5: "+str1.compareTo(str2));
		System.out.println("6: "+str1.compareToIgnoreCase(str2));
		System.out.println("7: "+str1.concat(str2));
		System.out.println("8: "+str1.hashCode());
		System.out.println("9: "+str1.indexOf('a'));
		System.out.println("10: "+str1.indexOf("91"));
		System.out.println("11: "+str1.indexOf('@', '@'));
		System.out.println("12: "+str1.concat(str2));
		System.out.println("13: "+str1.concat(str2));
		
		
	}
}
