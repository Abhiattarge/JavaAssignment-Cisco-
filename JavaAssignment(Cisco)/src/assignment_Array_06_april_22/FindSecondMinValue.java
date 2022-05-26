package assignment_Array_06_april_22;
import java.util.Scanner;
public class FindSecondMinValue {
	
	public static void main(String[] args) {
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of element you went in arrays");
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter all element :");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
					
			}
		}
		System.out.println("Second Max value "+a[n-2]);
		System.out.println("Second Min Value "+a[0]);
		
		

	}

}
