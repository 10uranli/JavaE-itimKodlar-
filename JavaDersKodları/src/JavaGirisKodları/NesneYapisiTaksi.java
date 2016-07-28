package JavaGirisKodlarý;

public class NesneYapisiTaksi {
	public static void main(String[] args) {
		yolcuAl();
		NesneYapisiArac nesneTaksi = new NesneYapisiArac();
		nesneTaksi.motorCalis();
	}
	public static void yolcuAl(){
		System.out.println("Yolcu Alýrým");
	}

}
