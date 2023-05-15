package array_coding;

import java.util.Arrays;

public class ReverseOrder {
	public static void main(String[] args) {
		int[] array = {7, 9, 12, 30, 4, 23, 35, 17, 6};
		
		for(int i = 0; i < array.length / 2; i++)
		{
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(array));
		
//		for(int i = array.length - 1; i >= 0; i--)
//		{
//			System.out.print(array[i] + ", ");
//		}
	}
}
