import java.util.ArrayList;

public class Exe_If {
	public static void main(String[] args) {
		boolean hasCard = true; 
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
	
		if (pocket.contains("money")) {
			System.out.println("Take a taxi");
		}else if (hasCard){
			System.out.println("Take a taxi");
		}else {
			System.out.println("Walk");
		}
	
	}

}
