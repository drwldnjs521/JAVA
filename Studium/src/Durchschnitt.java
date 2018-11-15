public class Durchschnitt {

	public static void main(String args[]) {
		double summe = 0.0;
		int anzahl = 0;

		while ( !StdIn.isEmpty() ) {
			double wert = StdIn.readDouble();
			summe += wert;

			anzahl++;
		}

		System.out.println( summe / anzahl );
	}
}
