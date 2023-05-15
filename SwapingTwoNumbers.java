package array_coding;

public class SwapingTwoNumbers {
	public static void main(String[] args) {
		int n1 = 25;
		int n2 = 50;
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println(n1);
		System.out.println(n2);
	}
}

// swap two numbers without using 3rd variable