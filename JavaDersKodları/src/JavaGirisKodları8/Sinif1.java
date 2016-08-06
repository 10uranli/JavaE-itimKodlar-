package JavaGirisKodlarý8;

public class Sinif1 {

	int a = 5;
	static int b = 4;

	public void metod() {
		System.out.println("Sinif1 metoduyum");

	}private void metodx() {
		System.out.println("Sinif1 metoduyum");

	}
	

	private class Sinif2 {
		private void metod2() {
			metod();
		}

		public class Sinif2_2 {
			int r = 8;
			private void Sinif2_2_Topla() {
				System.out.println(a + b);

			}
			public class Sinif2_2_2{
				int k = r;
				Sinif2 nes = new Sinif2(); 
			}
		}
	}

	protected class Sinif3 {
		int c = a + b;
		private int d = c;
		protected int e = d;

	}

	class Sinif4 {
		Sinif1 ness = new Sinif1();

		Sinif3 nes = new Sinif3();
		int d = nes.c;

	}

}
