package WichtigeFragen;

import java.util.Scanner;

public class PrimeNummer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir nsayi giriniz:");
				int sayi=scan.nextInt();
				
				/*Asal sayılar , 1'den büyük olacak şekilde, 1 ve kendisinden 
				 * başka pozitif tam sayı böleni olmayan tam sayılardır. Asal 
				 * sayılar 2, 3, 5, 7, 11, 13, 17, 19 gibi sadece 1'e ve kendisine 
				 * tam olarak bölünebilen tam sayılardan oluşur. 1 asal sayı değildir. 
				 * Asal sayıların en küçük ve çift olan sayısı 2'dir.*/
				 
				
				int count=0;
				for (int i = 1; i <sayi; i++) {
					if (sayi%i==0||sayi==1) {
						count++;
					}
				}if (count>0) {
					System.out.println("asal degildir");
				}else {
					System.out.println("asal sayidir");
				}
				
scan.close();
	}

}
