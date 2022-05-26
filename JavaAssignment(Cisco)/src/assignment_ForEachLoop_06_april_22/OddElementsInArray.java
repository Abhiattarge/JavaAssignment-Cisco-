package assignment_ForEachLoop_06_april_22;

import java.util.Scanner;

public class OddElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Odd Elements in array are:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}

	}

}
