package assignment_pattern__05_April;

public class Q4 {

	public static void main(String[] args) {
		// Q4 wap to print following pattern.
		
		int rows=5;
		
		for(int i=rows-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		

	}

}
