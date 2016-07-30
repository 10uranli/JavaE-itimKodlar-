package JavaGirisKodlarý4;

import java.util.Scanner;

public class Diziler2 {
	public static void main(String[] args) {
		int dizi[];
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç elemanlý dizi olsun ? ");
		int eleman = scan.nextInt();
		dizi = new int[eleman];

		while (i < eleman) {
			System.out.println(i + 1 + ". elemaný giriniz =  ");
			dizi[i] = scan.nextInt();
			i++;
		}
		for (int x = 0; x < dizi.length; x++) {
			System.out.println(dizi[x]);
		}
		for (int j : dizi) {
			System.out.println(j);
		}

	}
}
