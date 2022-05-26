package day1assignmentLoops;

public class DispalyFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,n=10,firstterm=0,secondterm=1;
		System.out.println("Fibonacci Series "+ n + "terms:");
		
		while(i<=n)
		{
			System.out.print(firstterm+",");
			
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			
			i++;
		}

	}

}
