package WichtigeFragen;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

	private static long[] neuArray;

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("kac sayi gireceksiniz");
		int sayi = scan.nextInt();
		int[] array = new int[sayi];
		int count=0;
		int toplam=0;
		while(count<sayi) {
			System.out.println("Dizinin "+(count+1)+". degerini giriniz: ");
			int dizi = scan.nextInt();
			array[count]=dizi;
			toplam+=dizi;
			count++;
		}Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		int ortalama = toplam/sayi;
		
		count=0;
		int a=0;
		System.out.println("ortalamadan buyuk olan sayilar: ");
		for (int i = 0; i <sayi; i++) {
			if (array[i]>ortalama) {
				a=array[i];
				
				System.out.print(a+" ");
		}
		}
	/*	}System.out.println(count);
		int[] neuArray = new int[count];
		for (int i = 0; i < sayi; i++) {
			for (int j =i; j <count; j++) {
				if(array[i]>ortalama) {
					neuArray[j]=array[i];
				}
			}
		}
		System.out.println(Arrays.toString(neuArray));*/
		}
}
