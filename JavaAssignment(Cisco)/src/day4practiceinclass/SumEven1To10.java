package day4practiceinclass;

public class SumEven1To10 {

	public static void main(String[] args) {
		// 4. Calculate sum of even number 1 to 10.
		
				 int sum=0;
				 
				 for(int i=1;i<=10;i++)
				 {
					 if(i%2==0)
						{
							sum=sum+i;
						}
				 }
				 System.out.println("Sum of Even Number from 1 to 10 : "+sum);
	}

}
