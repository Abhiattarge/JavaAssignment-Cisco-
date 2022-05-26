package assignment_Array_06_april_22;

public class AlternateElementOfArray {

	public static void printAlter(int[] arr,int n)
	{
		System.out.println("Alternate elements of an array");
		for(int currIndex=0;currIndex<n;currIndex++)
		{
			if(currIndex % 2 == 0)
			{
				System.out.println(arr[currIndex]);
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		
		printAlter(arr,n);
		
		

	}

}
