package day4practiceinclass;

public class OddNum1To20 {

	public static void main(String[] args) {
		// 3. Print odd number between 1 to 20.
		
				int n = 20;
				System.out.println("Odd Number from 1 to "+n+" are: ");
				for(int i = 1;i<=n;i++)
				{
					if(i%2!=0)
					{
						System.out.println(i + " ");
					}
				}
				

	}

}
