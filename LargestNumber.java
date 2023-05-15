package array_coding;

public class LargestNumber {
	public static void main(String[] args) {
		int[] array = {7, 9, 17, 27, 6, 3, 5};
		
		int largest = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > largest)
			{
				largest = array[i];
			}
		}
		System.out.println(largest);
	}
}
