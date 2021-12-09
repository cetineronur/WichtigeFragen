package WichtigeFragen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sayiMerdiveni {

    public static void main(String[] args) {


//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36    şeklini konsola yazdiriniz.

        
    	List<Integer> list = new ArrayList<>();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen piramidi kac satir gidecegini giriniz:");
    	int sayi = scan.nextInt();
 
    	
    	int a=1;
    	for (int i = 1; i <sayi+2; i++) {
        	for (int j =1; j <i; j++) {
				System.out.print(a++ +" ");
			}System.out.println();
        	
        }

       
    }
}
