package JavaGirisKodlar�4;

public class Diziler3 {

	public static void main(String[] args) {
		String dizi[][] = new String[3][2];
		dizi[0][0] = "onur";
		dizi[0][1] = "anli";
		dizi[1][0] = "ayse";
		dizi[1][1] = "g�rm�s";
		dizi[2][0] = "hatice";
		dizi[2][1] = "g�rmemis";
		dizi[2][1] = "g�rmemis";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(dizi[i][j]);
			}
			
		}

	}

}
