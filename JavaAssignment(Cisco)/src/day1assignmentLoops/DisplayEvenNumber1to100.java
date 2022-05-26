package day1assignmentLoops;

public class DisplayEvenNumber1to100 {

	public static void main(String[] args) {
		// write a java program even display number 1 to 100 using for loop.
		
		int number = 100;
		
		System.out.println("List of even number 1 to"+number);
		
		for(int i = 1; i <= 100; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
