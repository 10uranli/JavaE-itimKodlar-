package JavaGirisKodlar�4;

public class isimdasMetodKavrami {
public static void main(String[] args) {
	isimdasMetodKavrami nes = new isimdasMetodKavrami();
	nes.ayn�Isim();
	nes.ayn�Isim(true);
	nes.ayn�Isim(5);
	nes.ayn�Isim("Selam");
}
private void ayn�Isim() {
	System.out.println("Parametresiz.");

}
private void ayn�Isim(int i) {
	System.out.println("�nteger geldi.");

}
private void ayn�Isim(String i) {
	System.out.println("String geldi.");

}
private void ayn�Isim(Boolean i) {
	System.out.println("Boolean.");

}
}
