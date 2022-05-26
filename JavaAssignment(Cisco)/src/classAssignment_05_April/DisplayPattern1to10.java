package classAssignment_05_April;

public class DisplayPattern1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=1;
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}

	}

}
