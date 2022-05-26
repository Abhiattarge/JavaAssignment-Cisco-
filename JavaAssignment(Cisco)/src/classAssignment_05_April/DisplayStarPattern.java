package classAssignment_05_April;

public class DisplayStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row=4;
		
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

