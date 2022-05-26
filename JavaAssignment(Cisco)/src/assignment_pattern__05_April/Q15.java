package assignment_pattern__05_April;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(1);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
