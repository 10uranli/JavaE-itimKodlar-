package JavaGirisKodlar�8;

public class Static1 {
    static int deneme = 0;
    int deneme2;
	public static class StaticA {
		int deneme3 = deneme;
//		int deneme4 = deneme2; hata al�r�z.Static classta static olmayan� d��ardan getiremiyoruz.
		
		
		int a = 5;
		
		public static int topla(int x, int y) {
			return x + y;
		}

		public static void toplaYaz() {
			int b = 5;
			// System.out.println(a); a static olmad��� ve d��arda oldu�u i�in
			// hata verdi.
			System.out.println(b);// i�erde oldu�u i�in hata vermez.
		}
	}
	
	public  class Static_olmayan extends StaticA{//static olmayan static olana veremiyor.
		
	}
}
