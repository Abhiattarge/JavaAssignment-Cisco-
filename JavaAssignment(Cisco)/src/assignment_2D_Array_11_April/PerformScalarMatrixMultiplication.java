package assignment_2D_Array_11_April;

public class PerformScalarMatrixMultiplication {

	private static final int N = 3;

	public static void main(String[] args) {
		// write a java program to perform Scalar matrix multiplication.
		
		int mat[][]= {{1,2,3},
				      {4,5,6},
				      {7,8,9} 
				              };
		int k=4;
		scalarProductMat(mat, k);
		
		System.out.println("Scalar Product Matrix is : ");
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			    System.out.print(mat[i][j] +" ");
			System.out.println();
			
		}

	}

	private static void scalarProductMat(int[][] mat, int k) {
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				mat[i][j]=mat[i][j]*k;
			}
		}
		
	}

}
