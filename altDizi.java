package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tag28.staticKeyword;

public class altDizi {

	public static void main(String[] args) {
		/*
		 * Verilen bir tamsayı dizisinde 0 toplamı bulunan tüm alt dizileri yazdıran bir
		 * Java programı yazın. Örnek: Girdi: nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2}
		 * nums2 = {1, 2, -3, 4, 5, 6} nums3= {1, 2, -2, 3, 4, 5, 6} Çıktı: Toplamı 0
		 * olan alt diziler: [1, 3, -7, 3] Toplamı 0 olan alt diziler: [3, -7, 3, 2 ,3,
		 * 1, -3, -2] Toplamı 0 olan alt diziler : [1, 2, -3] Toplamı 0 olan alt diziler
		 * : [2, -2]
		 */

		
		List<Integer> list = new ArrayList<>();

		int[] array = { -1, -2, 0, -5, 4, 3, 2, 8, 0, -2, 1 };
		String sonuc = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int j2 = i + 2; j2 < array.length; j2++) {
					if (array[i] + array[j] + array[j2] == 0) {
						if (!sonuc.contains(array[i] + "+" + array[j] + "+" + array[j2])) {
							sonuc += array[i] + "+" + array[j] + "+" + array[j2] + " =0, ";
						}
					}
				}
			}
		}
		System.out.println(sonuc);
	}
}
