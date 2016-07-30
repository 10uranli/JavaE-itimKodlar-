package HesapMakinesi;

import java.text.BreakIterator;
import java.util.Scanner;

public class mainMetodu {
	public static void main(String[] args){
		
		while (1 == 1) {
			System.out.println("Toplama 1 Çýkarma 2 Bölme 3 Sistem Çýkýþý 0 basýnýz.. ");
			Scanner scan = new Scanner(System.in);
			int girilen = scan.nextInt();
			if (girilen == 1) {
				System.out.println("Ýlk Sayiyi Girin = ");
				int deger1 = scan.nextInt();
				System.out.println("Ýkinci Sayiyi Girin = ");
				int deger2 = scan.nextInt();
				int toplam = topla(deger1, deger2);
				System.out.println("Toplam : " + toplam);
				
			}
			else if (girilen == 2) {
				System.out.println("Ýlk Sayiyi Girin = ");
				int deger1 = scan.nextInt();
				System.out.println("Ýkinci Sayiyi Girin = ");
				int deger2 = scan.nextInt();
				int cikar = cikar(deger1, deger2);
				System.out.println("Fark : " + cikar);
				
			}
			else if (girilen == 3) {
				System.out.println("Ýlk Sayiyi Girin = ");
				int deger1 = scan.nextInt();
				System.out.println("Ýkinci Sayiyi Girin = ");
				int deger2 = scan.nextInt();
				float bol = bol(deger1, deger2);
				System.out.println("Toplam : " + bol);
				
			}
			else if (girilen == 0) {
				System.out.println("Güle Güle..");
				break;
			}
			
			
		}

		
				
	}
	
	public static int topla(int x, int y) {
		return x+y;
	}
	public static int cikar(int x, int y) {
		return x-y;

	}
	public static float bol(int x, int y) {
		return x/y;

	}
	
	
}
