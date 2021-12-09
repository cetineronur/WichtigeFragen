package WichtigeFragen;

import java.util.Scanner;

public class ulkeNufus {
	
	static int a=50;

	public static void main(String[] args) {
		/*main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
	      countryNames Ülke isimleri
	      countryPopulations Ülke nüfusları

	    populationOfCountry adında bir metod yaznız.
	    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

	    Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
	    göndersin.

	      Ornegin;

	        countryNames = {"USA" ,"Mexico" ,"Canada"}

	        countryPopulations = {100000 , 120000 , 130000}

	        str = "Mexico"

	        return 120000 olmali

	        NOT : eger (ulkeAdi) icin verilen ulke countryNames icinde yoksa return -1 olmali*/
	
		
		String[] countryNames = {"USA" ,"Mexico" ,"Canada"};
		int[] countryPopulations = {100000 , 120000 , 130000};
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ulkenin nufusunu ogrenmek icin ismini giirniz: ");
		String ulkeAdi = scan.nextLine();
		
		populationOfCountry(countryNames,countryPopulations,ulkeAdi);
	}

	private static void populationOfCountry(String[] countryNames, int[] countryPopulations, String ulkeAdi) {
		if (ulkeAdi.contains(countryNames[0])) {
			System.out.println(countryPopulations[0]);
		}else if(ulkeAdi.contains(countryNames[1])) {
			System.out.println(countryPopulations[1]);
		}else if(ulkeAdi.contains(countryNames[2])) {
			System.out.println(countryPopulations[2]);
		}
		
	}

}
