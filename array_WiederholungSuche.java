package WichtigeFragen;

import java.util.ArrayList;
import java.util.List;

public class array_WiederholungSuche {

	public static void main(String[] args) {
		//tekrarli olanlari yazdiran programi yazin.
		int[] array= {5,7,8,9,5,3,2,3,8,9,5};
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					if (!list.contains(array[i])){
						list.add(array[i]);
					}
			}
		}

	}System.out.println(list);

}
}