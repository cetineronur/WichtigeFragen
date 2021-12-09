package WichtigeFragen;

import java.util.Arrays;
import java.util.Scanner;

public class TekCift {

	public static void main(String[] args) {
		/*threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
		  gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
		  false göndersin.

		  Örnek:

		   intArray([2, 1, 3, 5]) sonuc  true olmalı
		   intArray([2, 1, 2, 5]) sonuc   false olmalı
		   intArray([2, 4, 2, 5]) sonuc   true olmalı*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kac tane sayi gireceksiniz: ");
		int sayi= scan.nextInt();
		int[] array = new int[sayi];
		int count=0, sayi1=0;
		while(count<sayi) {
			System.out.println(count+1+". sayiyi giriniz: ");
			sayi1=scan.nextInt();
			array[count]=sayi1;
			count++;
		}
		threeEvenOrOdd(array,sayi);

	}

	private static void threeEvenOrOdd(int[] array, int sayi) {
		int ciftCount=0, tekCount=0;
		
		for (int i = 0; i < sayi; i++) {
			if (array[i]%2==0) {
				ciftCount++;
			}else if (array[i]%2==1) {
				tekCount++;
			}
		}
		if ((ciftCount>=3)||(tekCount>=3)) {
			System.out.println(Arrays.toString(array));
			System.out.println("True");
		}else {
			System.out.println(Arrays.toString(array));
			System.out.println("False");
		}
	}
}
