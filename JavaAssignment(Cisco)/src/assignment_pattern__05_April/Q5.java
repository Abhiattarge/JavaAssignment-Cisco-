package assignment_pattern__05_April;

public class Q5 {

	public static void main(String[] args) {
		// Q5 wap to print following pattern.
		
		int row=5;
		
		for(int i=row;i>=1;i--)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
