package assignment_pattern__05_April;

public class Q6 {

	public static void main(String[] args) {
		// Q6 wap to print following pattern.
		
		int i,j,rows=5;
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
