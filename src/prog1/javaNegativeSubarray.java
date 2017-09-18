/**
 * 
 */
package prog1;

/**
 * @author Ankit.Mittal
 *
 */
public class javaNegativeSubarray {
	public static void main(String[] args) {

		int count=0;
		int [] arr={1,-2,4,-5,1};
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			sum +=arr[i];
			if(arr[i]<0)
			{
				count++;
			}

				for(int j=i+1;j<arr.length;j++)
				{
					sum=sum+arr[j];
					if(sum<0)
					{
						count++;
						System.out.println(i+"/"+j+"/"+sum+"/"+count);
					}
				}	
			}
		System.out.println(count);

	}

}
