package assignment_2D_Array_11_April;

public class FindSumOfMainDiagonalEle {

	public static void main(String[] args) {
		// write a java program find sum of main diagonal elements of a matrix.
		
		int a[][]= {{1,2,3,},
				    {4,5,6},
				    {7,8,9}
		           };
		
		int sum=diagonalSum(a);
		
		System.out.println("Sum of Main Diagonal elements = "+ sum);

	}
	
    public static int diagonalSum(int[][] a)
    {
    	int sum=0;
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			if(i==j)
    				sum +=a[i][j];
    		}
    	}
    	return sum;
    }

}
