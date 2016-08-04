package JavaGirisKodlarý7;

public class Trafik_Araba extends Trafik_Kural_Abstract {

	@Override
	public void emniyetKemeri() {
		System.out.println("Emniyet kemerimi taktým.");
		
	}

	@Override
	public void hýzlanma() {
		System.out.println("Hýzýmý azalttým");
		
	}
	public static void koltukAyarý(){
		System.out.println("Koltuðu öne çektim.");
	}
	public static void main(String[] args) {
		Trafik_Araba araba = new Trafik_Araba();
		araba.emniyetKemeri();
		araba.hýzlanma();
		araba.koltukAyarý();
		araba.arabaKontrol();
		
	}

}
