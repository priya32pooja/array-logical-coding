package array_coding;

public class TopTwoMaximum {
	public static void main(String[] args) {
		int[] array = {8, 9, 20, 14, 25, 5, 7, 1, 22, 30};
		
		int max1 = array[0];
		int max2 = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > max1)
			{
				max2 = max1;
				max1 = array[i];
			}
			else if(array[i] > max2)
			{
				max2 = array[i];
			}
		}
		System.out.println(max1 + ", " + max2);
	}
}
