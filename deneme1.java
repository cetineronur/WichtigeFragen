package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class deneme1 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac tane sayi girmek istiyorsunuz: ");
		int sayi=scan.nextInt();
		int[] array = new int[sayi];
		int sayi1=0;
		int a=0;
		while(a<sayi) {
			System.out.println(a+1+". sayiyi giriniz:");
			sayi1=scan.nextInt();
			array[a]=sayi1;
			a++;
		}
		int[] array1 = new int[array.length];
		
		for (int i = 0; i<array.length; i++) {
			
			array1[i]=array[array.length-i-1];
			
		}System.out.println(Arrays.toString(array1));
		
		
	}
}
