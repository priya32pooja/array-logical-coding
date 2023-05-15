package array_coding;

public class DuplicateNumber {
	public static void main(String[] args) {
		int[] array = {2, 2, 4, 5, 4, 7, 8, 11, 7, 13, 5};
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[i] == array[j])
				{
					System.out.println(array[j]);
				}
			}
		}
	}
}

// print the duplicate number in the given array