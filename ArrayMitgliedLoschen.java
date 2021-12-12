package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayMitgliedLoschen {
//Arrayden istenilen elemani silme
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kac sayi gireceksiniz");
		int sayi=scan.nextInt();
		int[] array=new int[sayi];
		int[] array1=new int[sayi-1];
		int count=0;
		while(count<sayi) {
			System.out.println(count+1+". sayiyi giriniz:");
			array[count]=scan.nextInt();
			count++;
		}System.out.println(Arrays.toString(array));
		
		System.out.println("silmek istediginiz degeri giriniz:");
		int a=scan.nextInt();
		int b=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]!=a) {
				array1[b]=array[i];
				b++;
			}
		}
		
		System.out.println(Arrays.toString(array1));
	}

}
