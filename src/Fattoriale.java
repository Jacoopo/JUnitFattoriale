/**
 * 
 * @author Canoci Jacopo
 * @version 3.0
 *
 */
public class Fattoriale {
	/**
	 * Costruttore della classe Fattoriale 
	 */
	public Fattoriale() {
	}

	/**
	 * Metodo che restituisce il fattoriale 
	 * @param n il numero che l'utente mette in input
	 * @return il valore del fattoriale
	 */
	public float fattoriale(int n) {
		int fatt, i;
		fatt = 1;
		for (i = 1; i < n; i++) { //<=
			fatt = fatt * i;
		}
		return fatt;
	}

}
