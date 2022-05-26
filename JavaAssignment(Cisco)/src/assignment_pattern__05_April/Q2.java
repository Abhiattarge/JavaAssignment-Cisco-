package assignment_pattern__05_April;

public class Q2 {

	public static void main(String[] args) {
		// Q2 wap to print following pattern.
		
		int i,j,row=5;
		
		for(i=0;i<row;i++)
		{
			for(j=2*(row-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
