package WichtigeFragen;

import java.util.Scanner;

public class tersPiramid {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       şeklini konsola yazdiriniz.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen bir rakam giriniz: ");
        int x = scan.nextInt();
        
        int k =10;
        for (int i = 1; i <=x; i++) {
        	for (int j = i; j <=x; j++) {
				System.out.print(j+" ");
			}
        	System.out.println();
        	for (int j = 0; j < i; j++) {
        		System.out.print(" ");
			}
        	
        }
            
            
    }
}
