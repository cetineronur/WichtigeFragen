package WichtigeFragen;

public class simetrikArray {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
		int arr[] = { 1, 2, 3, 4,5,5, 4, 3, 2, 1};
		
		int count=0;
		for (int i = arr.length-1; i >=arr.length/2 ; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
		}if (count==(double)arr.length/2) {
			System.out.println("Verilen array simetrikdir.");
		}else {
			System.out.println("Verilen array simetrik degildir.");
		}

	}

}
