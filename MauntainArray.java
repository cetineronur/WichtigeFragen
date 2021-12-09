package WichtigeFragen;

import java.util.Iterator;

public class MauntainArray {

	public static void main(String[] args) {
		/*
		 * Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum
		 * value, decreasing constantly after the maximum value Not Mauntain Array-->
		 * [5, 2, 7, 1, 4]
		 * 
		 * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk
		 * degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
		 */
		int[] array = { 0, 8, 5, 6, 7 };

		boolean a = false;
		boolean b = false;
		String c = "";
		String d = "";

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] < array[i + 1]) {
				a = true;
				c += a;
			} else if(array[i]==array[i+1]) {
				c+="n";
				
			}else {
				c += b;
			}
		}
		System.out.println(c);
		
		int e=c.indexOf("f", 0);
		if (e!=-1) {
		if (c.substring(e).contains("t")||c.substring(e).contains("n")) {
			System.out.println("mauntain degil");
		}else {
			System.out.println("mauntain");
		}
		}else if(e==-1) {
			System.out.println("mauntain degil");
		}
	}

}
