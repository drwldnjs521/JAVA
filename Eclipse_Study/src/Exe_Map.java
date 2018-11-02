import java.util.HashMap;
public class Exe_Map {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("water", "wasser");
		dictionary.put("bottle", "flasche");
		
		System.out.println(dictionary.get("water"));
		System.out.println(dictionary.containsKey("bottle"));
		System.out.println(dictionary.remove("bottle"));
		System.out.println(dictionary.size());
	}

}
