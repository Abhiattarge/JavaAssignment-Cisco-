package assignment_ForEachLoop_06_april_22;

import java.util.Arrays;

public class FindCommonElementBetweenTwoArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,5,5,8,9};
		int[] arr2= {1,5,6,8,6,5};
		
		System.out.println("Arr1 ;"+Arrays.toString(arr1));
		System.out.println("Arr2 ;"+Arrays.toString(arr2));
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == (arr2[j]))
					System.out.println("Common element is :"+(arr1[i]));
			}
		}

	}

}
