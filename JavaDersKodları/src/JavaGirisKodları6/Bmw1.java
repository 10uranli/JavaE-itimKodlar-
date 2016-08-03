package JavaGirisKodlarý6;

public class Bmw1 extends Audi1 {
	public static void main(String[] args) {
		Bmw c = new Bmw();
		Bmw.nesnem(c);
	}

	@Override
	public void adSoyle() {
		System.out.println("Ben bmwyim");
	}
}
