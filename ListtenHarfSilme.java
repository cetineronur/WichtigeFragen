package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListtenHarfSilme {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
    	
    	ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
    	ArrayList<String> list1 = new ArrayList<>();
    	
    	for (String w : list) {
			if (!w.toLowerCase().contains("a")) {
				list1.add(w);
			}
    	}System.out.println(list1);
    	
			
    	/*Scanner input = new Scanner(System.in);
    	String list1;
    	String loschen="a";
    	
    	int count=0;
    	while(count<5 ) {
    	System.out.println(count+1+". ismi giriniz: ");
    	list1=input.next();
    	list.add(list1);
    	count++;
        	}
    	System.out.println(list);
    	for (int i = list.size()-1; i >=0; i--) {
			if (list.get(i).toLowerCase().contains("a")) {
				list.remove(i);
			}
		}System.out.println(list);*/
    	
    	}
    }
