package WichtigeFragen;

import java.util.ArrayList;

public class arrayListFibonacci {

	public static void main(String[] args) {
		// verilen bir sayidan kucuk fibonacci sayilarini bir list olarak kaydedelim.
		//1,1,2,3,5,8,13,21,34,55,......
		
		int sinir=10;
		
		ArrayList<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		
		int sayi=0;
		while (sayi<sinir) {
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			fibonacci.add(sayi);
		}	
		System.out.println(fibonacci);
		
		ArrayList<Integer> fibonacci1 = new ArrayList<>();
		int toplam=0;
		fibonacci1.add(0);
		fibonacci1.add(1);
		for (int i = 0; i <10; i++) {
			toplam=fibonacci1.get(i)+fibonacci1.get(i+1);
			fibonacci1.add(toplam);
		}System.out.println(fibonacci1);
		System.out.println(fibonacci.size());
		
	}
}
