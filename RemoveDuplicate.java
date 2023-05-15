package array_coding;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] array = {7, 4, 5, 7, 3, 4, 2, 2, 3, 1, 1, 9, 9};
		
		int duplicateCount = 0;
		for(int i = 0; i < array.length - duplicateCount; i++)
		{
			for(int j = i + 1; j < array.length - duplicateCount; j++)
			{
				if(array[i] == array[j])
				{
					for(int k = j; k < array.length - duplicateCount - 1; k++)
					{
						array[k] = array[k + 1];
					}
					j--;
					duplicateCount++;
				}
			}
		}
		int[] a1 = new int[array.length - duplicateCount];
		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = array[i];
		}
		System.out.println(Arrays.toString(a1));
	}
}

// remove the duplicate from given array
