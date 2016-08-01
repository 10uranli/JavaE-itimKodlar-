package JavaGirisKodları5;


public class ErisimBelirleyici {

	protected int degisken1;//aynı paket erişti farklı paket erişemedi.
	private int degisken2;//kimse erişemedi bana.Bundan dolaya get, set oluşturduk
	public int degisken3;//herkes erişti bana
	int degisken4;//aynı paket erişti, farklı paket erişemedi.
	static ErisimBelirleyici4 nes = new ErisimBelirleyici4();//default class aynı pakette çağrılır.
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
