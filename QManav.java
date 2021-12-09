package WichtigeFragen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi =new ArrayList<>();
	  
	static double toplamOdenecekTutar;
	static int kilo;
	static char harf;
	static int wahl;

	public static void main(String[] args) {
	List<Double> urunFiyatlari =new ArrayList<>();
	
		/* 
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
	
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 */
		
		Scanner scan = new Scanner(System.in);
		urunFiyatlari.add(0.99);
		urunFiyatlari.add(1.69);
		urunFiyatlari.add(1.15);
		urunFiyatlari.add(0.75);
		urunFiyatlari.add(0.95);
		secim(scan, urunFiyatlari);
		System.out.println("Toplam odenecek tutar: "+toplamOdenecekTutar);
	}

	private static double toplamOdenecekTutar(Double double1, int kilo) {
		toplamOdenecekTutar+=kilo*double1;
		//System.out.println("Toplam odenecek tutar: "+toplamOdenecekTutar);
		return toplamOdenecekTutar;
	}

	private static void secim(Scanner scan, List<Double> urunFiyatlari) {
		System.out.println("1.Banana\n"+"2.Domates\n"+"3.Biber\n"+"4.Salatalik\n"+"5.Portakal");
		System.out.println();
		System.out.println("******----------*******");
		System.out.println("almak istediginiz urunler icin yanlarindaki rakamlari yaziniz ");
		System.out.println(urunFiyatlari);	
		wahl=scan.nextInt();
		
		if (wahl==1) {
			banana(scan, urunFiyatlari,toplamOdenecekTutar);
		}else if (wahl==2) {
			domates(scan, urunFiyatlari,toplamOdenecekTutar);
		}else if(wahl==3) {
			biber(scan, urunFiyatlari,toplamOdenecekTutar);
		}else if (wahl==4) {
			salatalik(scan, urunFiyatlari,toplamOdenecekTutar);
		}else if(wahl==5) {
			portakal(scan, urunFiyatlari,toplamOdenecekTutar);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
			secim(scan, urunFiyatlari);
		}
	}
	private static void portakal(Scanner scan, List<Double> urunFiyatlari, double toplamOdenecekTutar) {
		System.out.println("Kac kilo Portakal almak isiyorsunuz: ");
		kilo =scan.nextInt();
		System.out.println("Baska bir urun almak istiyor musunuz E/H ");
		harf=scan.next().toUpperCase().charAt(0);
		if (harf=='E') {
			toplamOdenecekTutar(urunFiyatlari.get(4), kilo);
			secim(scan, urunFiyatlari);
		}else if (harf=='H') {
			
			toplamOdenecekTutar(urunFiyatlari.get(4), kilo);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
		}
		
	}



	private static void salatalik(Scanner scan, List<Double> urunFiyatlari, double toplamOdenecekTutar) {
		System.out.println("Kac kilo Salatalik almak isiyorsunuz: ");
		kilo =scan.nextInt();
		System.out.println("Baska bir urun almak istiyor musunuz E/H ");
		harf=scan.next().toUpperCase().charAt(0);
		if (harf=='E') {
			toplamOdenecekTutar(urunFiyatlari.get(3), kilo);
			secim(scan, urunFiyatlari);
		}else if (harf=='H') {
			toplamOdenecekTutar(urunFiyatlari.get(3), kilo);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
		}
		
	}



	private static void biber(Scanner scan, List<Double> urunFiyatlari, double toplamOdenecekTutar) {
		System.out.println("Kac kilo Biber almak isiyorsunuz: ");
		kilo =scan.nextInt();
		System.out.println("Baska bir urun almak istiyor musunuz E/H ");
		harf=scan.next().toUpperCase().charAt(0);
		if (harf=='E') {
			toplamOdenecekTutar(urunFiyatlari.get(2), kilo);
			secim(scan, urunFiyatlari);
		}else if (harf=='H') {
			
			toplamOdenecekTutar(urunFiyatlari.get(2), kilo);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
		}
		
	}



	private static void domates(Scanner scan, List<Double> urunFiyatlari, double toplamOdenecekTutar) {
		System.out.println("Kac kilo Domates almak isiyorsunuz: ");
		kilo =scan.nextInt();
		System.out.println("Baska bir urun almak istiyor musunuz E/H ");
		harf=scan.next().toUpperCase().charAt(0);
		if (harf=='E') {
			toplamOdenecekTutar(urunFiyatlari.get(1), kilo);
			secim(scan, urunFiyatlari);
			
		}else if (harf=='H') {
			toplamOdenecekTutar(urunFiyatlari.get(1), kilo);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
		}
		
	}

	private static void banana(Scanner scan, List<Double> urunFiyatlari, double toplamOdenecekTutar) {
		System.out.println("Kac kilo muz almak isiyorsunuz: ");
		kilo =scan.nextInt();
		System.out.println("Baska bir urun almak istiyor musunuz E/H ");
		harf=scan.next().toUpperCase().charAt(0);
		if (harf=='E') {
			toplamOdenecekTutar(urunFiyatlari.get(0), kilo);
			secim(scan, urunFiyatlari);
		}else if (harf=='H') {
			toplamOdenecekTutar(urunFiyatlari.get(0), kilo);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
		}
	}
}
