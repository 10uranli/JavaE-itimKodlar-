package JavaGirisKodları5;


public class ErisimBelirleyici {

	protected int degisken1;//ayni paket eristi farkli erisemidi.
	private int degisken2;//kimse erisemedi.Bundan dolayi set get olusturuldu.
	public int degisken3;//herkes eristi bana
	int degisken4;//ayni paket eristi, farkli paket erisemedi.
	static ErisimBelirleyici4 nes = new ErisimBelirleyici4();//default class ayni pakette çagrilir.
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
