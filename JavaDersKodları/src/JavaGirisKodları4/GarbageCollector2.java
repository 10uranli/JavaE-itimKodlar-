package JavaGirisKodlar�4;

public class GarbageCollector2 {
public  static int seker = 0;

public  void sekerVer() {
	seker++;
	System.out.println("�eker verildi = " + seker);

}
@Override
	protected void finalize() throws Throwable {
		System.out.println("Yok edildi");
	}
	
	
}
