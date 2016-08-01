package JavaGirisKodlarý4;

public class Diziler4 {
	 static String str[] = { "1", "2", "3", "4", "5" };

	public static void main(String[] args) {
		int i = str.length;
		System.out.println(i);
		diziAl(str);
		
	}

	public static void diziAl(String dizi[]) {
		for(String j:dizi){
			System.out.println(j);
		}
	}

}
