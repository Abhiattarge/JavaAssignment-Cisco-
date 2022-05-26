package assignment_2D_Array_11_April;

import java.util.Scanner;

public class CheckSymmetric {

	public static void main(String[] args) {
		//write a java program to check symmetric matrix
		Scanner sc = new Scanner(System.in);
		
		int i,j,row,col,flag=1;
		
		System.out.print("Enter the number of rows: ");
		row=sc.nextInt();
		
		System.out.print("Enter the number of column: ");
		col=sc.nextInt();
		
		int[][] mat=new int[row][col];
		System.out.println("Enter the matrix elements:");
		
		for(i=0;i<row;i++)
		{                                   // 6 5 2 5 0 9 2 9 3
			                                // 6 1 2 5 0 9 2 9 3
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		checkSymmetric(mat, row, col);

	}

	private static void checkSymmetric(int[][] mat, int row, int col) {
		int i, j, flag=1;
		
		System.out.println("The matrix formed is: ");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		int [][] transpose = new int [row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				transpose[j][i]=mat[i][j];
			}
		}
		
		if(row==col)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					if(mat[i][j] != transpose[i][j])
					{
						flag=0;
						break;
					}
				}
				if(flag == 0)
				{
					System.out.println("The matrix is Not Symmetric");
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("The matrix is Symmetric");
			}	
		}
		else
		{
			System.out.println("The matrix is Not Symmetric");
		}
	}

	
}
