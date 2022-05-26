package assignment_2D_Array_11_April;

public class FindSumOfMinorDiagonalEle {

	public static void main(String[] args) {
		// write a java program find sum of minor diagonal elements of a matrix.
		int a[][]= {{1,2,3,},
			        {4,5,6},
			        {7,8,9}
	               };
	
	int sum=minorum(a);
	
	
	System.out.println("Sum of minor diagonal elements = "+ sum);

}

    public static int minorum(int[][] a)
    {
	   int sum=0;
	   for(int i=0;i<a.length;i++)
	   {
		  for(int j=2;j>=0;j--)
		  {
			if(i==j)
				sum +=a[i][j];
		  }
	  }
	   return sum;
}


}

