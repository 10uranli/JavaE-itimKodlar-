package JavaGirisKodlar�2;

import java.util.Scanner;



public class KontrolYapilari {
	public static void main(String[] args) {
		System.out.println("�simini gir =  ");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		if(a.equals("ayse")){
			System.out.println("Ay�esin");
		}
		else if(a.equals("hatice")){
			System.out.println("haticesin");
		}
		else if(a.equals("mehtap")){
			System.out.println("mehtaps�n");
		}
	    else{
			System.out.println("�smin baya kar���k");
		}
		
  	}
}
