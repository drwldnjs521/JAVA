
public class Fehlermeldung {
	public static void main(String args[]) {
		if (args.length < 2) {
			System.out.println("Fehler: mindestens zwei positive Zahlen.");
			System.out.println("Zahlen werden erwartet.");
			System.exit(-1);
		}
			
			int[] arr = new int[args.length];
			
			for (int i = 0; i < args.length; i++) {
				arr[i] = Integer.parseInt(args[i]);
				if (arr[i] < 0) {
					System.out.print("Fehler: " +arr[i]);
					System.out.println("ist nicht positiv!");
					System.exit(-1);
				}
				System.out.println(arr[i]);
					
			}
			System.out.println("Argumente sind korrekt.");
			
		}
	}


