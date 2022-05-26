package assignment_2D_Array_11_April;

import java.util.Scanner;

public class FindSumOfLowerTriangularMatrix {
	
	public static void main(String[] args) {
		// write a java program find sum of lower triangular matrix.
		
		int i,j,rows,cols,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter Lower triangular Matrix Rows and Cols:");
		rows=sc.nextInt();
		cols=sc.nextInt();
		
		int[][] arr=new int[rows][cols];
		
		System.out.println("Enter element of matrix:");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				if(i>j)
				{
					sum=sum+arr[i][j];
				}
			}
		}
         System.out.println("The sum of Lower Triangle Matrix = "+sum);
	}

}
