package JavaGirisKodlarý4;

import java.util.Arrays;

public class Diziler5 {
	public static void main(String[] args) {
		int dizi[] =  {1,5,7,10,8,15}; 
		sirala(dizi);
	}
	public static void sirala(int dizi[]){
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i+1+".eleman = "+dizi[i]);
		}
	}
	
}
