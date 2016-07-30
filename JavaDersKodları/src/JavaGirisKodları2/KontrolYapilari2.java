package JavaGirisKodlarý2;

import java.util.Scanner;

public class KontrolYapilari2 {

	public static void main(String[] args) {
		System.out.println("Günleri Söylerim!Kaçýncý günü soruyorsun?");
		Scanner scan = new Scanner(System.in);
		int gun = scan.nextInt();
		switch(gun){
		case 1:System.out.println("Pazartesi");break;
		case 2:System.out.println("Salý");
		case 3:System.out.println("Çarþamba");break;
		case 4:System.out.println("Perþembe");break;
		case 5:System.out.println("Cuma");break;
		case 6:System.out.println("C.tesi");
		case 7:System.out.println("Pazar");break;
		}

	}

}
