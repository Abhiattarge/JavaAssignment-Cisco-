package classAssignment_05_April;

public class DisplayPatternAlphabet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet=97;
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)alphabet);
				alphabet++;
			}
			System.out.println();
		}

	}

}
