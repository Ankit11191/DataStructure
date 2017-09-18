package com.java2novoice.interview.programs;

import java.util.Arrays;

public class MyArrayList {
	private Object[] myarr;
	private int actualSize=0;
	private int MaxSize=5;
	Object val;
	
	MyArrayList()
	{
		myarr=new Object[MaxSize];
	}
	
	private void increaseArrayListSize()
	{
		myarr=Arrays.copyOf(myarr, myarr.length*2);
	}
	
	public Object getvalue(int index) 
	{
		if(index<actualSize)
		{
			val= myarr[index];
		}
		else
		{
			System.out.println("array out of bound");
		}
		
		return val;
	}
	
	public void addElement(Object item)
	{
		if(myarr.length-1<actualSize)
		{
			increaseArrayListSize();
		}
		myarr[actualSize]=item;
		actualSize++;
	}
	
	public Object removeElement(int index)
	{
		if(index<=actualSize)
		{
			val=myarr[index];
			myarr[index]=null;
			int temp=index;
			while(temp<actualSize-1)
			{
				myarr[temp]=myarr[temp+1];
				myarr[temp+1]=null;
				temp++;
			}
			actualSize--;
		}
		else
		{
			System.out.println("list is empty");
		}
		return val;
	}


	public static void main(String[] args) {
		
		MyArrayList arrayList=new MyArrayList();
		arrayList.addElement(0);
		arrayList.addElement(1);
		arrayList.addElement(2);
		arrayList.addElement(3);
		arrayList.addElement(4);
		arrayList.addElement(5);
		arrayList.addElement(6);
		arrayList.addElement(7);
		arrayList.addElement(8);
		arrayList.addElement(9);
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.getvalue(3));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		System.out.println(arrayList.removeElement(0));
		for(int i=0;i<arrayList.actualSize;i++)
		{
			System.out.println(arrayList.getvalue(i));
		}
	}
}
