package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListContains {

	public static void main(String[] args) {
		// verilen bir array'de tekrar eden elementleri sadece birer tane yazarak 
		
		int[] arr = {2,3,4,5,3,6,2,5,3,7,4,9,8,7,6,5,50};
		
		ArrayList<Integer> tekrarsiz = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
		} System.out.println(tekrarsiz);
		int[] tekrarsizArray = new int[tekrarsiz.size()];// array olusturduk. boyutu belli, listenin size i kadar.
		System.out.println(Arrays.toString(tekrarsizArray));// [0, 0, 0, 0, 0, 0, 0, 0]
		
		for (int i = 0; i < tekrarsizArray.length; i++) {
			tekrarsizArray[i] =tekrarsiz.get(i);		// list den alip olusturdugumuz araye attik.
		}System.out.println(Arrays.toString(tekrarsizArray));
		
	}

}
