package assignment_2D_Array_11_April;

public class CreateTransposeOfMatrix {

	public static void main(String[] args) {
		//write a java program create transpose of a matrix.
		
		int original[][]= {{1,3,4},{2,4,3,},{3,4,5}};
		
		int transpose[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=original[j][i];
			}
		}
		System.out.println("Printing matrix without transpose.");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(original[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("printing matrix after transpose.");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}

	}

}
