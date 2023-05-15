package array_coding;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int j = 19;
	    boolean flag = true;
	    for (int i = 2; i <= j / 2; ++i) 
	    {
	      if (j % i == 0) 
	      {
	        flag = false;
	        break;
	      }
	    }
	    System.out.println(flag ? j + " is a prime number." : j + " is not a prime number.");
	}
}
