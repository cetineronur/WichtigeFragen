package WichtigeFragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraysAsList {

	public static void main(String[] args) {
		// verilen array'i Arrays class'indan yardim alarak liste'e cevirebiliriz.
		
		String[] arr = {"A","B","C","d"};
		
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println(arraydenList); // list'e cevirir. fakat bir daha bir sey ekleyemezsiniz.
											// fakat birinde degisiklik yapinca digerine de hemen yansir.
		arr[1]="Z";
		System.out.println("Array'i degistirdikten sonra, array= "+Arrays.toString(arr));
		System.out.println("Array'i degistirdikten sonra, array= "+arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("listi degistirdikten sonra, array= "+arraydenList);
		System.out.println("Array'i degistirdikten sonra, array= "+Arrays.toString(arr));
	}

}
