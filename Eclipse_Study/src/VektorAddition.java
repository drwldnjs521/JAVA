
public class VektorAddition {
	public static void printVektor (char c, int v[]) {
		int i;
		
		System.out.print(c + " = ( ");
		for (i=0; i<v.length-1; i++) 
			System.out.print(v[i] + " , ");
		System.out.println(v[i] + " ) ");
    }
	
	public static void main (String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {2, 2, 5};
		int[] c = new int[3];
		
		printVektor('a', a);
		printVektor('b', b);
		
	    c[0] = a[0] + b[0];
	    c[1] = a[1] + b[1];
	    c[2] = a[2] + b[2];
	    
	    printVektor('c', c);
	 
	
	}

}
