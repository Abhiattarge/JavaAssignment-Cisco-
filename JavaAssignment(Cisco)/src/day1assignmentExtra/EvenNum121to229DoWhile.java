package day1assignmentExtra;

public class EvenNum121to229DoWhile {

	public static void main(String[] args) {
		// wap to print even numbers from 121 to 229 using do-while loop.
		
         int number=229,i=121;
		
		
		
		do {
			if(i%2==0)
			{
				System.out.println("Even number from 121 to 229 is :"+i);
			}
			i++;
		}while(i<=229);

	}

}
