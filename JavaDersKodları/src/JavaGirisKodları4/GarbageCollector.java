package JavaGirisKodlarý4;

import HesapMakinesi.mainMetodu;

public class GarbageCollector {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		GarbageCollector2 nes = new GarbageCollector2();
		nes.sekerVer();
	}
	System.gc();
	for (int i = 0; i < 10; i++) {
		GarbageCollector2 nes = new GarbageCollector2();
		nes.sekerVer();
	}
}
}
