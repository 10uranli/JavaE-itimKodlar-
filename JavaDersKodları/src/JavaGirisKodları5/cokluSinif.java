package JavaGirisKodları5;

public class cokluSinif {
	final int PI = 5;//DEĞİŞTİRİLEMEZ.
	public cokluSinif(){
		System.out.println("Coklu Sinif");
	}
	public class birinci {
		public birinci() {
			System.out.println("Birinci Yapilandirici");
		}
	

		public class ikinci {
			public ikinci() {
				System.out.println("ikinci yapilandirici");
				
			}
		}
	}

	public final void metod() {
		//ezilemez
	}
}
