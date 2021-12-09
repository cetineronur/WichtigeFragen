package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaMarket {

	double odenecek;
	double toplamodenecek;
	
	public static void main(String[] args) {
		/*
		 * Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz. No Ürün Fiyat
		 * ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02 Biber 1.50 TL
		 * 03 Soğan 2.30 TL 04 Havuç 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 Çilek
		 * 6.10 TL 08 Kavun 4.30 TL 09 Üzüm 2.70 TL 10 Limon 0.50 TL
		 * 
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz. 3.
		 * Adım: Kaç kg satın almak istediğini sorunuz. 4. Adım: Alınacak bu ürünü
		 * sepete ekleyiniz ve Sepeti yazdırınız. 5. Başka bir ürün alıp almak
		 * istemediğini sorunuz. 6. Eğer devam etmek istiyorsa yeniden ürün seçme
		 * kısmına yönlendiriniz. 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para
		 * ustu hesaplayarak programı bitirinzi.
		 */
		
		ArrayList<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Soğan", "Havuc",
				"Elma", "Muz", "Cilek", "Kavun", "Uzum", "limon"));
		ArrayList<Double> fiyat = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.5));

		secim(urunler, fiyat);
	
	}

	public static void secim(ArrayList<String> urunler, ArrayList<Double> fiyat) {
		System.out.println("===========Java Markete Hosgeldiniz============");
		System.out.println("  No            Urun               Fiyat");
		System.out.println("=====         ========            =======");
		int count = 0;
		while (count < 11) {
	System.out.println("  " + count + "            " + urunler.get(count) + "               " + fiyat.get(count));
			count++;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen satin almak istediginiz urunu urun nosuna gore giriniz :");
		int secim = scan.nextInt();
		System.out.println("kac kilo almak istiyorsunuz?");
		int kilo = scan.nextInt();
		sepet(scan, urunler, fiyat, kilo, secim);

	}

	 public static double sepet(Scanner scan, ArrayList<String> urunler, ArrayList<Double> fiyat, int kilo, int secim) {
		
		JavaMarket market = new JavaMarket();
		
		market.odenecek = kilo * fiyat.get(secim);
		market.toplamodenecek += market.odenecek;

		System.out.println("odeyeceginiz toplam tutar: " + market.toplamodenecek);
		System.out.println();
		System.out.println("Baska bir urun almak istiyor musunuz? E/H");
		char wahl = scan.next().toUpperCase().charAt(0);
		if (wahl == 'E') {
			secim(urunler, fiyat);
		} else if (wahl == 'H') {
			System.out.println("odeyeceginiz toplam tutar: " + market.toplamodenecek);
			System.out.println("ne kadar para odediniz:");
			int paraustu = scan.nextInt();
			System.out.println("Paraustu :" + (paraustu - market.toplamodenecek));
		}
		return market.toplamodenecek;
		
		// baskaurun(scan,urunler,fiyat, secim,kilo);
	}

}
