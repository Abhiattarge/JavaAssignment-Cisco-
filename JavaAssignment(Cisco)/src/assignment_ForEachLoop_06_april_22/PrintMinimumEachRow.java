package assignment_ForEachLoop_06_april_22;

public class PrintMinimumEachRow 
{
	
	public static void minelementrow(int[][] arr,int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			int minm = arr[i][1];
			
			for(int j=0;j<m;j++)
			{
				if(arr[i][j] < minm)
				{
					minm=arr[i][j];
				}
			}
			System.out.println(minm+" and ");
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) 
	{
		int n=2,m=3;
		int arr [][]={{20,31,9},{12,25,16}};
		System.out.print("Minimum element of each row is: ");
		minelementrow( arr,n,m);
		
		
		
	}

}
