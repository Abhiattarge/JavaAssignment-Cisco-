package classAssignment_05_April;

import java.util.Scanner;

public class DisplayPatternAlphabet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int letter=97;
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)letter +" ");
			}
			letter++;
			System.out.println();
		}
	}

}
