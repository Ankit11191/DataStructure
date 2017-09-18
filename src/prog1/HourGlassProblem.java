package prog1;

public class HourGlassProblem {

	public static void main(String[] args) {

		int arr[][] = {	{-1, -1, 0, -9, -2, -2},
						{-2, -1, -6, -8, -2, -5},
						{-1, -1, -1, -2, -3, -4},
				        {-1, -9, -2, -4, -4, -5},
				        {-7, -3, -3, -2, -9, -9},
				        {-1, -3, -1, -2, -4, -5}};


		int temp_sum=Integer.MIN_VALUE;
        for(int m=0;m<4;m++)
        {
    		int sum=0;
            for(int n=0;n<4;n++)
            {
               sum=arr[m][n]+arr[m][n+1]+arr[m][n+2];
               sum=sum+arr[m+1][n+1];
               sum=sum+arr[m+2][n]+arr[m+2][n+1]+arr[m+2][n+2];
                if(sum>temp_sum)
                {
                    temp_sum=sum;
                }
            }
            System.out.println(sum+"-"+temp_sum);
        }
        System.out.println(temp_sum);
    }
}


