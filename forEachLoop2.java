package WichtigeFragen;

import java.util.ArrayList;
import java.util.List;

public class forEachLoop2 {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
		//kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		
		String[] str1 = {"ali", "Veli", "Mustafa","Onur"};
		String[] str2 = {"Nevin", "Veli", "Mustafa","Elif"};
		List<String> neuList = new ArrayList<>();
		for (String i : str1) {
			for (String j : str2) {
				if (i.contains(j)) {
					neuList.add(j);
				}
			}
		}System.out.println(neuList);
		

	}

}
