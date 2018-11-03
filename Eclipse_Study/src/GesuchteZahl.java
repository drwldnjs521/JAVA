
public class GesuchteZahl {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
		int gesucht = 13;
		
		int l = 0;
		int r = arr.length - 1;
		int m;
		
		while(r >= 1) {
			m = (l + r)/2;
			if(gesucht == arr[m]) {
				System.out.println("Gefunden bei m = " + m);
				break;
			} else {
				if (gesucht < arr[m])
					r = m - 1;
				else
					l = m + 1;
			}
		}
	}

}
