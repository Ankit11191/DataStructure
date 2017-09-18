package com.java2novoice.interview.programs;

public class CommonElementsIn2Arraies {

	public void common(int[] A, int[]B)
	{
		int count=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				if(A[i]==B[j])
				{
					System.out.println(A[i]);
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("No duplicate elemants");
		}
			
	}
	
	
	public static void main(String[] args) {
		CommonElementsIn2Arraies arraies=new CommonElementsIn2Arraies();
		int[] A={1,2,4,5,6,7,8,9};
		int[] B={2,11,11,14,13,0};
		arraies.common(A, B);	
	}

}
