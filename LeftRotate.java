package array_coding;

import java.util.Arrays;

public class LeftRotate {
	public static void main(String[] args) {
		int[] array = {5, 2, 9, 12, 3, 8, 20, 7, 1};
		
		int temp = array[0];
		int temp1 = array[1];
		for(int i = 0; i < array.length - 2; i++)
		{
			array[i] = array[i + 2];
		}
		array[array.length - 2] = temp;
		array[array.length - 1] = temp1;
		System.out.println(Arrays.toString(array));
	}
}

// left rotate by 2