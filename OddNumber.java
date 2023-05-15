package array_coding;

public class OddNumber {
	public static void main(String[] args) {
		int[] array = {3, 1, 2, 12, 5, 7, 21};
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 1)
			{
				System.out.print(array[i] + ", ");
			}
		}
	}
}

// print odd numbers