package JavaGirisKodlar�2;

import java.util.Scanner;

public class KontrolYapilari2 {

	public static void main(String[] args) {
		System.out.println("G�nleri S�ylerim!Ka��nc� g�n� soruyorsun?");
		Scanner scan = new Scanner(System.in);
		int gun = scan.nextInt();
		switch(gun){
		case 1:System.out.println("Pazartesi");break;
		case 2:System.out.println("Sal�");
		case 3:System.out.println("�ar�amba");break;
		case 4:System.out.println("Per�embe");break;
		case 5:System.out.println("Cuma");break;
		case 6:System.out.println("C.tesi");
		case 7:System.out.println("Pazar");break;
		}

	}

}
