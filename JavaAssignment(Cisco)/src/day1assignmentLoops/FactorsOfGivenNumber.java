package day1assignmentLoops;
import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to find factors: ");
		number=sc.nextInt();
		
		for(int i=1;i<=number;++i)
		{
			if(number%i==0)
			{
				System.out.println(i +" ");
			}
		}
		
		
	
		

	}

}
