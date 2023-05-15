package array_coding;

public class Sum {
	public static void main(String[] args) {
		int[] array = {3, 6, 7, 5, 8, 1, 2};
		
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		System.out.println(sum);
	}
}

// sum of elements