package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
	 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
	 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
	 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
	 *
	 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
	 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
	 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
	 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
	 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * 			 ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * 			 ortalama kazançtan aşağıysa o günleri return yap.
	 * */
	int a=0;
	 
	static int ortalamaKazanc;
	static int toplamKazanc;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> gunler =new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
		List<Integer> gunlukKazanc =new ArrayList<>();
		int a=0;
		int kazanc=0;
		
		while(a<7) {
			System.out.println(gunler.get(a)+" gununun kazancini girin: ");
			kazanc=scan.nextInt();
			gunlukKazanc.add(kazanc);
			a++;
		}
		getOrtalamaKazanc(gunlukKazanc,gunler);
		getOrtalamaninUstundeKazancGünleri(gunlukKazanc,gunler);
		getOrtalamaninAltindaKazancGünleri(gunlukKazanc,gunler);
	}

	private static void getOrtalamaninAltindaKazancGünleri(List<Integer> gunlukKazanc, List<String> gunler) {
		
		for (int i = 0; i < gunlukKazanc.size(); i++) {
			if (gunlukKazanc.get(i)<ortalamaKazanc) {
				System.out.println(gunler.get(i)+" gunu ortalamanin altinda kazandiniz.");
			}
		}
		
	}

	private static void getOrtalamaninUstundeKazancGünleri(List<Integer> gunlukKazanc, List<String> gunler) {
		for (int i = 0; i < gunlukKazanc.size(); i++) {
			if (gunlukKazanc.get(i)>ortalamaKazanc) {
				System.out.println(gunler.get(i)+" gunu ortalamanin ustunde kazandiniz.");
			}
		}
		
	}

	private static void getOrtalamaKazanc(List<Integer> gunlukKazanc, List<String> gunler) {
		for (int i = 0; i < gunler.size(); i++) {
			toplamKazanc+= gunlukKazanc.get(i);
		}
		ortalamaKazanc=toplamKazanc/7;
		
		System.out.println("Bu hafta ortalama kazandiginiz miktar: "+ortalamaKazanc);
		
	}
}