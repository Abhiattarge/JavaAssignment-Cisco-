package assignment_pattern__05_April;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		
		for(int i=1;i<=rows;i++)
		{
			int num;
			if(i%2==0)
			{
				num=0;
				
				for(int j=1;j<=rows;j++)
				{
					System.out.print(num);
					num=(num==0)?1:0;
				}
			}
			else
			{
				num=1;
				
				for(int j=1;j<=rows;j++)
				{
					System.out.print(num);
					num=(num==0)?1:0;
				}
			}
			System.out.println();
		}

	}

}
