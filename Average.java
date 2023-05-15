package array_coding;

public class Average {
	public static void main(String[] args) {
		int[] array = {7, 2, 5, 9, 1};
		
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		double avg = (double) sum / array.length;
		System.out.println(avg);
	}
}
