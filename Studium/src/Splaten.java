
public class Splaten {
	
	public static void main(String[] args) {
		int x[] = {10, 100, 30};
		int y[] = { 3,  32, 30};
		
		StdOut.printf("%5s%5s", "x", "y");
		StdOut.println();
		StdOut.println("-------------------");
		
		for (int i = 0; i < x.length; i++) {
			StdOut.printf("%5s%5s", x[i],y[i]);
			StdOut.println();
		}
	}

}
