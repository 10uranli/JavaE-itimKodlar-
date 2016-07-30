package JavaGirisKodlarý2;

import java.util.Scanner;



public class KontrolYapilari {
	public static void main(String[] args) {
		System.out.println("Ýsimini gir =  ");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		if(a.equals("ayse")){
			System.out.println("Ayþesin");
		}
		else if(a.equals("hatice")){
			System.out.println("haticesin");
		}
		else if(a.equals("mehtap")){
			System.out.println("mehtapsýn");
		}
	    else{
			System.out.println("Ýsmin baya karýþýk");
		}
		
  	}
}
