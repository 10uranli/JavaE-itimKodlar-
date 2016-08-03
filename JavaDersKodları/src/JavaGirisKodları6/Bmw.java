package JavaGirisKodlarý6;

public class Bmw extends Audi{

	public static void main(String[] args) {
		Bmw c = new Bmw();
		Bmw.nesnem(c);
	}

	@Override
	public void adSoyle() {
		System.out.println("Ben bmwyim");
	}
}
