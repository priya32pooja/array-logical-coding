package array_coding;

import java.util.Arrays;

public class InsertElement {
	public static void main(String[] args) {
		int[] array = {4, 9, 1, 29, 27, 15, 1};
		int[] a1 = array;
		array = new int[a1.length + 1];
		for(int i = 0; i < a1.length; i++)
		{
			array[i] = a1[i];
		}
		array[array.length - 1] = 20;
		System.out.println(Arrays.toString(array));
	}
}

// insert the element at last