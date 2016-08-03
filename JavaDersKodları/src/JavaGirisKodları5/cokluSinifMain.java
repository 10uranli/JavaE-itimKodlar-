package JavaGirisKodları5;

public class cokluSinifMain {
public static void main(String[] args) {
		cokluSinif nes = new cokluSinif();
		System.out.println("**********");
		cokluSinif.birinci nesne1 = new cokluSinif().new birinci();
		System.out.println("**********");
		cokluSinif.birinci.ikinci nesne2 = new cokluSinif().new birinci().new ikinci();
	}
}
