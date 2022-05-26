package day1assignmentLoops;

public class DisplayOddNumber200to300 {

	public static void main(String[] args) {
		// write a java program display all odd number from 200 to 300.
		
int number = 300;
		
		System.out.println("List of Odd number 200 to"+number);
		
		for(int i = 200; i <= 300; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
