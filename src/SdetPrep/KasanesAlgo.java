package SdetPrep;

public class KasanesAlgo {

	public int matrixSum(int[] values)
	{
		int max_strt=values[0];
		int max_end=0;
		@SuppressWarnings("unused")
		int start=0, end=0,s=0; 
		for(int i=0;i<values.length;i++)
		{
			max_end=max_end+values[i];
			if(max_strt<max_end)
			{
				max_strt=max_end;
				start=s;end=i;
			}
			if(max_end<0)
			{
				max_end=0;
				s=s+1;
			}
		}
		return max_end;
	}
		
	public static void main(String[] args) 
	{
		int[] Ankit={1,2,2,1,-1,-3,-7,22,1,3,-6,-8,-20,9,90};
			KasanesAlgo algo=new KasanesAlgo();
			int maxSum=algo.matrixSum(Ankit);
			System.out.println(maxSum);
	}
}