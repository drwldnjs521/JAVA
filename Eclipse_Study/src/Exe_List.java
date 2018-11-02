import java.util.ArrayList;
public class Exe_List {
	public static void main(String[] args) {
		ArrayList<Integer> income = new ArrayList<Integer>();
		income.add(400);
		income.add(500);
		income.add(600);
		income.add(0, 700);
		
		System.out.println(income.get(2));
		System.out.println(income.size());
		System.out.println(income.contains(400));
		System.out.println(income.remove(1));
		System.out.println(income);
	}

}