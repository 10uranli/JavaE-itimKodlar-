package JavaGirisKodlarý7;

public class Sahin {

	public static void calisirim() {
		System.out.println("calisirim");
	}

	public static void fren() {
		System.out.println("dururum");
	}
	public static void main(String[] args) {
		Sahin audi = new Audi();
		audi.calisirim();
		audi.fren();
		((Audi) audi).sporMod();
		Audi a1 = new Audi();
		a1.sporMod();
		
		Audi nes = (Audi) new Sahin();
		
		Sahin Sahin_Nes = new Sahin();
		Audi nes2 = (Audi) Sahin_Nes;
		
		
	}

}
