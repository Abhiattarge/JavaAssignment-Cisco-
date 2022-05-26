package assignment_Array_06_april_22;

import java.util.Scanner;

public class CalculateAverageOfAllElements {

	public static void main(String[] args) {
		System.out.println("How many numbers you want to enter?");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		double[] arr=new double[n];
		double total=0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Element no."+(i+1)+": ");
			arr[i]=sc.nextDouble();
		}
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			total = total + arr[i];
		}
		double average = total/arr.length;
		
		System.out.println("the average is:"+average);
	
	}

}
