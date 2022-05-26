package day2assignment_if_else;

import java.util.Scanner;

public class CalculatePercentageGrade {

	public static void main(String[] args) {
		// 
		
		int english,chemistry,computers,physics,maths;
		float total,percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter five subject marks:");
		english=sc.nextInt();
		chemistry=sc.nextInt();
		computers=sc.nextInt();
		physics=sc.nextInt();
		maths=sc.nextInt();
		
		total=english+chemistry+computers+physics+maths;
		percentage=(total/500)*100;
		
		System.out.println("Total Marks: "+total);
		System.out.println("Marks Percentage; "+percentage);
		
		if(percentage >= 90)
		{
			System.out.println("\n Grade A");
		}
		else if(percentage >= 80)
		{
			System.out.println("\n Grade B");
		}
		else if(percentage >= 70)
		{
			System.out.println("\n Grade C");
		}
		else if(percentage >= 60)
		{
			System.out.println("\n Grade D");
		}
		else if(percentage >= 40)
		{
			System.out.println("\n Grade E");
		}
		else
		{
			System.out.println("\n Fail");
		}
	}

}
