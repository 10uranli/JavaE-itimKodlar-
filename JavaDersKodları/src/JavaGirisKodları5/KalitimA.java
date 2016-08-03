package JavaGirisKodları5;

public class KalitimA extends KalitimB {
	public static void cikar() {
		System.out.println("KaltimA cikaririrm");
	}
	public static void main(String[] args) {
		
		cikar();
		topla();
		KalitimA selfObj = new KalitimA();
		KalitimB baba = new KalitimB(5);//Parametreli yapilandiriciyi ne yazık ki direk extends sonrası çalıştıramıyoruz.
	}
	
//	ctrl+shift l
}
