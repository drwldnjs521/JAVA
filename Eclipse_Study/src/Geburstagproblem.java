
public class Geburstagproblem {
	public static void main(String[] args) {
		boolean[] geburstags = new boolean[365];
		int personen = 0; 
		
		while (true) {
			personen++; 
	        int tag = (int) (365 * Math.random()); 
	        
	        if (geburstags[tag] == true)
	        	break;
	        
	     
	        geburstags[tag] = true;
		}
		System.out.println(personen);
		
}

}
