package JavaGirisKodlarý8;

public class SinifA {
	int a = 5;

	private void selam() {
		System.out.println("Selam ben a");

	}

	public class SinifB {

		public void yazdir() {
			System.out.println(a);
			selam();
		}

	}

	private class SinifC {
		public class SinifD{
			SinifA.SinifC nes = new SinifA().new SinifC();
		}
	}

	public static class SinifE{
		private void ictenSelam() {
			System.out.println("ictenselam");
			SinifA nes = new SinifA();
			nes.selam();

		}
	}
}
