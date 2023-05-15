package array_coding;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] array = {3, 9, 21, 5, 7, 10, 6};
		
		int small = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] < small)
			{
				small = array[i];
			}
		}
		System.out.println(small);
	}
}
