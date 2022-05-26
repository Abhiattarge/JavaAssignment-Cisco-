package assignment_Array_06_april_22;

public class SquareOfAllElementArray {

	public static void main(String[] args) {
		int[] temp = {23,43,25,49,12,9,78,66,39};
		
		for(int value : temp)
		{
			System.out.println(value);
		}
		
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=(int)Math.pow(temp[i],2);
		}
		
		for(int value : temp)
		{
			System.out.println(value);
		}
	}

}
