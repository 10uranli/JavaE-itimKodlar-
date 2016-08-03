package JavaGirisKodları5;

public class Overridee {

	@Override
	public boolean equals(Object obj) {
		System.out.println("söz büyüğün değil söz küçüğün");
		return false;
	}

	public static void main(String[] args) {
		Overridee nes = new Overridee();
		nes.equals(nes);

	}

}
