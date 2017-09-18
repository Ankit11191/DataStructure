package SdetPrep;

public class FindNegativeIn2DArray {

	public static void main(String[] args) 
	{
		int[][] ankit={{-2,-1,-1,-3},{-2,2,3,5},{1,2,3,4}};
		
		int sum=0;
		
		for(int a=ankit.length-1;a>=0;a--)
		{
			for(int b=ankit[a].length-1;b>=0;b--)
			{
				if(ankit[a][b]<0)
				{
					sum++;
				}
			}
		}

		System.out.println(sum);
		
		for(int i=0;i<ankit.length;i++)
		{
			for(int j=0;j<ankit[i].length;j++)
			{
					System.out.print(ankit[i][j]+",");
			}
			System.out.println();
		}
	}
}
