package com.java2novoice.interview.programs;

public class middleIndexFind {
	public int findMiddleIndex(int[] number)
	{
		int endIndex=number.length-1;
		int startIndex=0;
		int sumLeft=0;
		int sumRight=0;
		while(true)
		{
			if(sumLeft>sumRight)
			{
//				System.out.println("if"+number[endIndex--]);
				sumRight +=number[endIndex--];
			}
			else 
			{
	//			System.out.println("else"+number[startIndex++]);
				sumLeft +=number[startIndex++];
			}
			if(endIndex<startIndex)
			{
				if(sumRight==sumLeft)
				{
					break;
				}
			}
		}
		return endIndex;
	}

	public static void main(String[] args) {
		middleIndexFind find=new middleIndexFind();
		int[] num={60, 50, 40, 30, 20, 10};
		System.out.println("aaaa:"+find.findMiddleIndex(num) +"/" + num[find.findMiddleIndex(num)]);
		

	}

}
