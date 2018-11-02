
public class Exe_String {
	public static void main(String[] args) {
		String a = "Hello Java";
	    String b = "Hello Java";
	    String c = new String("Hello Java");
	    
	    
	    System.out.println(a.equals(b));
	    System.out.println(b.equals(c));
	    System.out.println(b == c);
	    
	    System.out.println(a.indexOf("Java"));
	    System.out.println(a.replaceAll("Java", "Jeewon"));
	    System.out.println(a.substring(2,6));
	    System.out.println(a.toUpperCase());
	}

}
