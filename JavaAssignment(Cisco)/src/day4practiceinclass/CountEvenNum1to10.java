package day4practiceinclass;

public class CountEvenNum1to10 {

	public static void main(String[] args) {
		// 2. Count number of even numbers between 1 to 10.
		 
				int i=1,count=0;
				System.out.println("Total of even number between 1 to 20 are\n"+count);
				while(i<=10)
				{
					if(i%2==0)
					{
						count++;
						System.out.println(i);
					}
					i++;
				}

	}

}
