
public class FIZZBUZZ_2 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		for (int i = 0; i <= N; i++) 
			if(i % 4 == 0 && i % 6 == 0) 
				System.out.println("FIZZBUZZ");
				else if (i % 4 == 0)
					System.out.println("FIZZ");
				else if (i % 6 == 0)
					System.out.println("BUZZ");
				else
					System.out.println(i);
			
		
	}

}
