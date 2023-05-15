package array_coding;

public class EvenNumber {
	public static void main(String[] args) {
		int[] array = {7, 2, 6, 9, 4, 3};
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 0)
			{
				System.out.print(array[i] + ", ");
			}
		}
	}
}

// print even numbers