
public class FIZZBUZZ_1 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		for (int i = 1; i < N+1; i++ ) {
			if (i % 4 == 0 && i % 6 == 0) 
				System.out.println("FIZZBUZZ");
			else if (i % 6 == 0)
				System.out.println("BUZZ");
			else if (i % 4 == 0)		
				System.out.println("FIZZ");
			else
				System.out.println(i);
		}
	}

}
