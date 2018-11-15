
public class SelbstmeidenderPfad {
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);
		int sackgassen = 0;
		
		for (int t = 0; t < T; t++) {
			boolean[][] arr = new boolean[N][N];
			int x = N/2; 
			int y = N/2;
			
			while (x > 0 && y > 0 && x < N-1 && y < N-1) {
				
				if (arr[x-1][y] && arr[x+1][y] && arr[x][y-1] && arr[x][y+1]) {
					sackgassen ++;
					break;
				}
				
				double r = Math.random();
				
				if (r < 0.25) {if (!arr[x+1][y]) x++;}
				else if (r < 0.5) {if (!arr[x-1][y]) x--;}
				else if (r < 0.75) {if (!arr[x][y+1]) y++;}
				else if (r < 1.00) {if (!arr[x][y-1]) y--;}
				
				arr[x][y] = true;
				
				
				
			}
			
			dump(arr);
		
		}
		System.out.println("Sachgasse: " +sackgassen);
		System.out.println(100 * sackgassen / T + " % Sackgassen.");

	}
		public static void dump(boolean arr[][]) {
			for (int y = 0; y < arr.length; y++) {
				for (int x = 0; x < arr.length; x++) {
					if (arr[y][x] ) System.out.print("*");
					else 			System.out.print(".");
				}
				System.out.println();
				
			}
		}
		
	}


