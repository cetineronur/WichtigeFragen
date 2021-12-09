package WichtigeFragen;

import java.util.Scanner;

public class recursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kaca kadar sayilari toplamak istiyorsunuz : ");
		int sayi = scan.nextInt();
		
		System.out.println(topla(sayi));
	}

	private static int topla(int sayi) {
		if (sayi<=0) return 0;	// kullanicinin girdigi sayiya kadar olan sayilarin toplamini bulur.
		
		return sayi+topla(sayi-1);
		
		
	}

}
