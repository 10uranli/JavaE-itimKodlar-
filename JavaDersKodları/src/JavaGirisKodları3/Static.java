package JavaGirisKodlar�3;

public class Static {
	static int a = 5; /*Metodlar�n d���nda global de�i�ken atan�r.T�m metodlarda �a�r�labilmesi i�in static olmal�*/

	int b = 4; /*Static olmad��� i�in sadece yaz�ld��� alanda etkili.Metodlar b yi g�remez*/

	public static void main(String[] args) {
		
		statik_metod();
		
		Static nesne = new Static();
		nesne.statik_olmayan_metod();
		Static2 nes = new Static2();
		nes.konus();
		
/*Bu alanda b ye eri�emeyiz.*/
		
	}
	public static void statik_metod() {
		System.out.println("Statik metod");
		
		
	}
	public void statik_olmayan_metod() {
		
		System.out.println("statik de�ilim");
		a = 5; /*Bu alanda bile a ya etki var.Static ��nk�.*/

	}

}


