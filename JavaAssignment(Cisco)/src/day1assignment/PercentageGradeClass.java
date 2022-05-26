package day1assignment;

import java.util.Scanner;

public class PercentageGradeClass {

	public static void main(String[] args) {
		//five subject mark check the per display grade or class
		//per >70 display grade distingtion
		//per 60 = 70 display first class
		//per 50 to 60 second class
		//per 35 to 50 last
		// per 35 < fail
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the marks of five subjects:\n");
		
		float sub_1=in.nextFloat();
		float sub_2=in.nextFloat();
		float sub_3=in.nextFloat();
		float sub_4=in.nextFloat();
		float sub_5=in.nextFloat();
		
		
		
		float percentage;
		float total;
		char grade;
		
		
		total=sub_1+sub_2+sub_3+sub_4+sub_5;
		
		percentage = (float)((total/500.0)*100);
		
		if(percentage > 70 )
		{
			System.out.println("Distingtion");
		}
		else if(percentage > 60 && percentage < 70)
		{
			System.out.println("First Class");
		}
		else if(percentage > 50 && percentage < 60)
		{
			System.out.println("Second Class");
		}
		else if(percentage > 35 && percentage <50)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("Fail");
		}
		

		System.out.println("\nThe Total Marks = "+total+"/500.0");
		System.out.println("The percentage ="+percentage+"%");
		
	}

}
