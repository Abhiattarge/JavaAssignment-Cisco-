package day4practiceinclass;

public class OddNum1to20WhileLoop {

	public static void main(String[] args) {
		// 
		int n = 1;
		System.out.println("Odd Number from 1 to  20"+" are: ");
		
		while(n<=20)
		{
			if(n%2!=0)
			{
				System.out.println(n + " ");
			}
			n++;
		}
	}

}
