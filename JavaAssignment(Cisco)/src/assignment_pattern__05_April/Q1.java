package assignment_pattern__05_April;

public class Q1 {

	public static void main(String[] args) {
		// wap to print following pattern.
		
		int i,j,row=5;
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
