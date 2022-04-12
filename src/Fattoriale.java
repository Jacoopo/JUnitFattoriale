
public class Fattoriale {
	public Fattoriale() {
	}

	public float fattoriale(int n) {
		int fatt, i;
		fatt = 1;
		for (i = 1; i < n; i++) {
			fatt = fatt * i;
		}
		return fatt;
	}

}
