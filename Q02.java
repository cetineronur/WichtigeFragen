package WichtigeFragen;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {


        //multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    	Scanner scan = new Scanner(System.in);
    	System.out.println("kaca kaclik olusturacaksiniz:");
    	int sayi1 = scan.nextInt();
    	int sayi2 = scan.nextInt();
    	int[][] array = new int[sayi1][sayi2];
    	int toplam=0;
    	int[] neuArray=new int[sayi1];
    	for (int i = 0; i <sayi1; i++) { //3
			for (int j = 0; j <sayi2; j++) { //2
			
    		System.out.println("Lutfen dizinin sayilarini giriniz: ");
    		int a=scan.nextInt();
    		array[i][j]=a;
			}
    	}
    	System.out.println(Arrays.deepToString(array));
    	for (int i = 0; i <sayi1; i++) {
			for (int j = 0; j <sayi2; j++) {
			neuArray[i]+=array[i][j];
			}
		}System.out.println(Arrays.toString(neuArray));
    }
    }

