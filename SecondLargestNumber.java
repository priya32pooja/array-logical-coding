package array_coding;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] array = {7, 9, 2, 19, 23, 2, 5, 15, 34};
		
		int secondlargest = array[0];
		int secondlargest1 = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > secondlargest)
			{
				secondlargest1 = secondlargest;
				secondlargest = array[i];
			}
			else if(array[i] > secondlargest1)
			{
				secondlargest1 = array[i];
			}
		}
		System.out.println(secondlargest1);
	}
}
