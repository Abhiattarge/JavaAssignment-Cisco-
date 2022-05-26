package assignment_pattern__05_April;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,rows=5;
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}

	}

}
