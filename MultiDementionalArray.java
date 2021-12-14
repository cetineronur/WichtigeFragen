package WichtigeFragen;

import java.util.Arrays;

public class MultiDementionalArray {

	public static void main(String[] args) {
	
		
		int[][] array = { {5,7,8}, {2,4,7}, {4,5,6},   {10,11,12} };
		int[][] array1= { {1,2,3}, {8,9,12},{19,20,21},{24,25,26} };
		
		int[][] bos = new int[4][3];
		
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 3; j++) {
			bos[i][j]=array[i][j]+array1[i][j];
		}
	}System.out.println(Arrays.deepToString(bos));
	}
}

