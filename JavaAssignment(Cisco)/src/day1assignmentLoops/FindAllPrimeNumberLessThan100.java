package day1assignmentLoops;

public class FindAllPrimeNumberLessThan100 {

	public static void main(String[] args) {
		// write a java program find all prime numbers < 100.
		
		int i = 0;
		int num = 0;
		String PrimeNumbers = " ";
		
		for(i=1;i<=100;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				PrimeNumbers = PrimeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers < 100 are:");
		System.out.println(PrimeNumbers);

	}

}
