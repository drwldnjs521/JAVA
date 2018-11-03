
public class sortieren {
	public static void main(String[] args) {
		int arr[] = {6, 2, 5, 3, 1, 7, 4, 8, 9};
		boolean getauscht;
		
		do {
			getauscht = false;
			
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i +1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					getauscht = true; 
				}
				System.out.println(arr[i]);
				}
		} while (getauscht);
	}

}
