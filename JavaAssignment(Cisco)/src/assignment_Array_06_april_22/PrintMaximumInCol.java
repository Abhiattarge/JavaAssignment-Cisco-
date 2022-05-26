package assignment_Array_06_april_22;

public class PrintMaximumInCol {

	public static void maximumInColumn(int cols,int[][] arr)
	{
		for(int i=0;i<cols;i++)
		{
			int maxm=arr[0][i];
			for(int j=1;j<arr[i].length;j++)
				if(arr[j][i]>maxm)
					maxm=arr[j][i];
			System.out.println("maximum in each column: "+maxm);
					
		}
	}
	public static void main(String[] args) 
	{
		int [][] arr = new int [][] {{22,31,9},{12,5,16},{34,42,2}};
		
		maximumInColumn(3,arr);
		

	}

}
