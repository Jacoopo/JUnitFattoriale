/**
 * 
 * @author Canoci Jacopo
 * @version 2.0
 *
 */
public class Fattoriale {
	/**
	 * Costruttore della classe Fattoriale 
	 */
	public Fattoriale() {
	}

	public float fattoriale(int n) {
		int fatt, i;
		fatt = 1;
		for (i = 1; i < n; i++) { //<=
			fatt = fatt * i;
		}
		return fatt;
	}

}
