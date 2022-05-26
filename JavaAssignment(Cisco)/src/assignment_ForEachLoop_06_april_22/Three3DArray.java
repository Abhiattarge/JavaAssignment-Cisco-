package assignment_ForEachLoop_06_april_22;

public class Three3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] test= {
				{
					{1,-2,3},
			        {2,3,4}
					},
				    {
				      {-4,-5,6,9},
				      {1},
				      {2,3}
				     }
			     };
		System.out.println("All elements in 3D array:");
		for(int[][] array2D : test)
		{
			for(int[] array1D: array2D)
			{
				for(int item: array1D)
				{
					System.out.print(item+" ");
				}
			}
		}

	}

}
