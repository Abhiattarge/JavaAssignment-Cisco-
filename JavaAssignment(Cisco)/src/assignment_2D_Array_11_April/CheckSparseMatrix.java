package assignment_2D_Array_11_April;

import java.util.Scanner;

public class CheckSparseMatrix {

	public void checkSparse(int a[][])
	{
		int zeros=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
				{
					zeros++;
				}
			}
		}
		int i = 0;
		if(zeros>(a.length*a[i].length)/2)
		{
			System.out.println("Sparse");
		}
		else
		{
			System.out.println("Not Sparse");
		} 
	}
	public static void main(String[] args) {
		//write a java program check if a matrix is sparse matrix.
		//print "Sparse" if it is else print "Not Sparse.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want to...? ");
		int rows=sc.nextInt();
		System.out.println("How many columns you want to...? ");
		int columns=sc.nextInt();
		
		int a[][]=new int[rows][columns];
		//int zeros=0;
		System.out.println("Enter the element of the matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		CheckSparseMatrix  o = new CheckSparseMatrix ();
		o.checkSparse(a);
		
		
	}

}
