package JavaGirisKodlar�5;


public class ErisimBelirleyici {

	protected int degisken1;//ayn� paket eri�ti farkl� paket eri�emedi.
	private int degisken2;//kimse eri�emedi bana.Bundan dolaya get, set olu�turduk
	public int degisken3;//herkes eri�ti bana
	int degisken4;//ayn� paket eri�ti, farkl� paket eri�emedi.
	static ErisimBelirleyici4 nes = new ErisimBelirleyici4();//default class ayn� pakette �a�r�l�r.
	public static void main(String[] args) {
		nes.hello();
	}
	public int getDegisken2() {
		return degisken2;
	}
	public void setDegisken2(int degisken2) {
		this.degisken2 = degisken2;
	}
	
}
