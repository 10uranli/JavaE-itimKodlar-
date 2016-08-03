package JavaGirisKodlarý6;

public class Araba1 {

	public void calis() {
		System.out.println("calisirim");

	}

	public void adSoyle() {
		System.out.println("Ben Arabayým");
	}

	public static void nesnem(Araba1 nesne) {
		if(nesne instanceof Araba1){
			nesne.calis();
			nesne.adSoyle();
		}
		else if(nesne instanceof Audi1){
			nesne.calis();
			nesne.adSoyle();
		}
	}
	
	public static void main(String[] args) {
		Araba1 araba = new Araba1();
		nesnem(araba);
		System.out.println("************");
		Audi1 audi = new Audi1();
		nesnem(audi);
		System.out.println("************");
		Araba1 audi2 = new Audi1();
		nesnem(audi2);
		System.out.println("************");
	
	}

}
