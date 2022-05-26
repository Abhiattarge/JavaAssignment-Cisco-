package assignment_pattern__05_April;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of row o print the pattern");
		
		int rows=sc.nextInt();
		System.out.println("** Printing the Pattern.......***");
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("0");
			}
			System.out.print(i +"");
			for(int k=i;k<rows;k++)
			{
				System.out.print("0");
			}
			System.out.println();
		}

	}

}
