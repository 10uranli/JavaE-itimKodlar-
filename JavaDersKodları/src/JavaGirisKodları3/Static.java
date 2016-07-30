package JavaGirisKodlarý3;

public class Static {
	static int a = 5; /*Metodlarýn dýþýnda global deðiþken atanýr.Tüm metodlarda çaðrýlabilmesi için static olmalý*/

	int b = 4; /*Static olmadýðý için sadece yazýldýðý alanda etkili.Metodlar b yi göremez*/

	public static void main(String[] args) {
		
		statik_metod();
		
		Static nesne = new Static();
		nesne.statik_olmayan_metod();
		Static2 nes = new Static2();
		nes.konus();
		
/*Bu alanda b ye eriþemeyiz.*/
		
	}
	public static void statik_metod() {
		System.out.println("Statik metod");
		
		
	}
	public void statik_olmayan_metod() {
		
		System.out.println("statik deðilim");
		a = 5; /*Bu alanda bile a ya etki var.Static çünkü.*/

	}

}


