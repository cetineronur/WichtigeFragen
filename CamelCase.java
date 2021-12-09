package WichtigeFragen;

import java.util.Scanner;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("ad ve soyad giriniz:");
    	String adSoyad= scan.nextLine();
    	String[] array = adSoyad.split(" ");

        System.out.println(camelcase(adSoyad, array));
    }
    public static String camelcase(String adSoyad, String[] array) {
    	
    	String neuName=array[0].substring(0, 1).toUpperCase()
    			+array[0].substring(1).toLowerCase()+" "
    			+array[1].substring(0,1 ).toUpperCase()
    			+array[1].substring(1).toLowerCase();   
    	
        return neuName;



    }


}
