package JavaGirisKodlarý3;

public class Static3 {
	public static int a;
	public int b;

	public static void main(String[] args) {
		Static3 nes1 = new Static3();
		Static3 nes2 = new Static3();
		nes1.a = 5;
		nes1.b = 10;

	
		goster(nes1);
		goster(nes2);

	}

	public static void goster(Static3 nesne) {
		System.out.println("a = "+nesne.a);
		System.out.println("b = "+nesne.b);

	}

}
