package JavaGirisKodlar�8;

public class Sinif1Main {

	public static void main(String[] args) {
		Sinif1 sinif1 = new Sinif1();
//		sinif1.metodx; private metoda ula�amaz.
//		Sinif1.Sinif2 ula�amaz sinif2 private
		Sinif1.Sinif3 sinif3 = new Sinif1().new Sinif3();
		int a = sinif3.c;
		 a = sinif3.e;//d private eri�ilemez
	}

}
