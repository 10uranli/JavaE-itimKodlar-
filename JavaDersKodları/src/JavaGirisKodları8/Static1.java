package JavaGirisKodlarý8;

public class Static1 {
    static int deneme = 0;
    int deneme2;
	public static class StaticA {
		int deneme3 = deneme;
//		int deneme4 = deneme2; hata alýrýz.Static classta static olmayaný dýþardan getiremiyoruz.
		
		
		int a = 5;
		
		public static int topla(int x, int y) {
			return x + y;
		}

		public static void toplaYaz() {
			int b = 5;
			// System.out.println(a); a static olmadýðý ve dýþarda olduðu için
			// hata verdi.
			System.out.println(b);// içerde olduðu için hata vermez.
		}
	}
	
	public  class Static_olmayan extends StaticA{//static olmayan static olana veremiyor.
		
	}
}
