package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class deneme {

	public static void main(String[] args) {
		/*Soru 4) P ve q boyutunda iki sıralanmış A ve B dizisi verildiğinde,
		 *  sıralanmış düzeni koruyarak 
		 * A'nın öğelerini B ile birleştirmek için bir Java programı yazın, 
		 * yani A'yı ilk p en küçük öğelerle doldurun 
		 * ve B'yi kalan öğelerle doldurun.
            Örnek:
        Giriş :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }
        Çıkış:
        Sıralı Diziler:
        A: [1, 2, 4, 5, 6, 7]
         B: [8, 9, 10]  */
		
		int[] a = { 1, 5, 6, 7, 8, 10 };
        int[] b = { 2, 4, 9 };
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
        	list.add(a[i]);
		}
        for (int i = 0; i < b.length; i++) {
        	list.add(b[i]);
		};
		list.sort(null);
		System.out.println(list);
		
		int[] c= new int[3];
		int[] d= new int[6];
		
		for (int i = list.size()-3; i <list.size(); i++) {
			c[i-6]=list.get(i);
		}
		System.out.println(Arrays.toString(c));
		
		for (int i = 0; i <list.size()-3; i++) {
			d[i]=list.get(i);
		}System.out.println(Arrays.toString(d));
		
	}

}
