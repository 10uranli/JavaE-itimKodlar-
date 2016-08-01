package JavaGirisKodları4;

public class isimdasMetodKavrami {
public static void main(String[] args) {
	isimdasMetodKavrami nes = new isimdasMetodKavrami();
	nes.aynıIsim();
	nes.aynıIsim(true);
	nes.aynıIsim(5);
	nes.aynıIsim("Selam");
}
private void aynıIsim() {
	System.out.println("Parametresiz.");

}
private void aynıIsim(int i) {
	System.out.println("İnteger geldi.");

}
private void aynıIsim(String i) {
	System.out.println("String geldi.");

}
private void aynıIsim(Boolean i) {
	System.out.println("Boolean.");

}
}
