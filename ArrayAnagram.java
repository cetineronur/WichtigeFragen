package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayAnagram {
	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf
		 * duyarliligi olmadan karakterleri ve karakter sayıları aynıysa "Anagram"
		 * yazdırın, aksi takdirde konsolda "Anagram Değil" yazdırın. Ornek : "Pide"
		 * ve"EDİP" anagram ifadelerdir..
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Kontrol icin bir kelime giriniz");
		String str = scan.next();
		System.out.println("Kontrol icin bir kelime giriniz");
		String str1 = scan.next();

		String[] array = str.split("");
		String[] array1 = str1.split("");

		Arrays.sort(array);
		Arrays.sort(array1);

		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array[i].equalsIgnoreCase(array1[i])) {
				count++;
			}
		}
		if (count == array.length) {
			System.out.println("Anagramdir");
		} else {
			System.out.println("Anagram degildir");
		}

	}

}