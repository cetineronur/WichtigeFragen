package WichtigeFragen;

public class Q07 {

    public static void main(String[] args) {
        /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{42,55},{-61,-17,80}}
         * Output : 
         */
    	int[][] array = {{1,2,-3},{42,55},{-61,-17,80}};

    	System.out.println(maxdegerBul(array));
    }

	private static int maxdegerBul(int[][] array) {
		int max=array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]>max) {
					max=array[i][j];
				}
			}
		}
		return max;
	}
}
