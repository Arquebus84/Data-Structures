
public class TimeComplexityAndAlgorithmComplexity {

	public static void main(String[] args) {
		int[] array = {3, 7, 3, 9, 6, 4, 2, 13, 5};
		
		int[] prefArr = prefixAvg(array);
		
		for(int i : prefArr) {
			System.out.print(i + " ");
		}

	}

	public static int[] prefixAvg(int[] arrayX) {
		int n = arrayX.length;
		int[] newArr = new int[n];
		
		for(int i = 0; i < n-1; i++) {
			int temp = arrayX[0];
			for(int j = 1; j < i; j++) {
				temp += arrayX[j];
			}
			newArr[i] = temp / (i+1);
		}
		
		return newArr;
	}
	
}