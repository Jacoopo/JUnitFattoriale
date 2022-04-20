/**
 * 
 * @author Canoci Jacopo
 * @version 4.1
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
	 * @return il valore del fattoriale che ha fatto tramite il numero messo
	 */
	public float fattoriale(int n) {
		int fatt, i;
		fatt = 1;
		for (i = 1; i < n; i++) { //<=
			fatt = fatt * i;
		}
		return fatt;
	}
	public static void main(String[] args) {
		Fattoriale f = new Fattoriale(); 
		System.out.println("Fattoriale: "+f.fattoriale(4));
	}

}
