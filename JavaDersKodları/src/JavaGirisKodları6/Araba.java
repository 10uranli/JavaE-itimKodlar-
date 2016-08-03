package JavaGirisKodlarý6;

public class Araba {

	public void calis() {
		System.out.println("calisirim");

	}

	public void adSoyle() {
		System.out.println("Ben Arabayým");
	}

	public static void nesnem(Araba nesne) {
		nesne.adSoyle();
		nesne.calis();
	}

	public static void main(String[] args) {
		Araba araba = new Araba();
		nesnem(araba);
		System.out.println("************");
		Audi audi = new Audi();
		nesnem(audi);
		System.out.println("************");
		Araba audi2 = new Audi();
		nesnem(audi2);
		System.out.println("************");
	
	}

}
