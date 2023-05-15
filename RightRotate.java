package array_coding;

import java.util.Arrays;

public class RightRotate {
	public static void main(String[] args) {
		int[] array = {3, 6, 8, 13, 23, 1, 9, 5};
		
		int temp = array[array.length - 1];
		int temp1 = array[array.length - 2];
		for(int i = 0; i < array.length - 2; i++)
		{
			array[i] = array[i + 2];
		}
		array[0] = temp1;
		array[1] = temp;
		System.out.println(Arrays.toString(array));
	}
}

// right rotate by 2