package JavaGirisKodlarý3;

public class MetodCar {
	public static void main(String[] args) {
		MetodYaya nesne = new MetodYaya("Onur");
		System.out.println(soyle(nesne));
	}

	public static String soyle(MetodYaya x){
		return x.yayaAd;
	}

}
