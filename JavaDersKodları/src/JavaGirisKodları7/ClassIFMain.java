package JavaGirisKodlarý7;

public class ClassIFMain {

	public static void main(String[] args) {
		ClassIF nesne1 = new ClassIF();

		ClassIF.ClassIF2 nesne2 = new ClassIF().new ClassIF2();
		nesne2.metod();

		ClassIF.ClassIF2.ClassIF2_2 nesne3 = new ClassIF().new ClassIF2().new ClassIF2_2();
		nesne3.metod();

	}

}
