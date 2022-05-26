package day4practiceinclass;

public class SumEven1to10WhileLoop {

	public static void main(String[] args) {
		// 
		
		int sum=0;
		int num=1;
		 
		 while(num<=10)
		 {
			 if(num%2==0)
				{
					sum=sum+num;
				}
			 num++;
		 }
		 System.out.println("Sum of Even Number from 1 to 10 : "+sum);


	}

}
