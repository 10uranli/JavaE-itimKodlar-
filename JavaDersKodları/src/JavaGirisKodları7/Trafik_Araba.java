package JavaGirisKodlar�7;

public class Trafik_Araba extends Trafik_Kural_Abstract {

	@Override
	public void emniyetKemeri() {
		System.out.println("Emniyet kemerimi takt�m.");
		
	}

	@Override
	public void h�zlanma() {
		System.out.println("H�z�m� azaltt�m");
		
	}
	public static void koltukAyar�(){
		System.out.println("Koltu�u �ne �ektim.");
	}
	public static void main(String[] args) {
		Trafik_Araba araba = new Trafik_Araba();
		araba.emniyetKemeri();
		araba.h�zlanma();
		araba.koltukAyar�();
		araba.arabaKontrol();
		
	}

}
