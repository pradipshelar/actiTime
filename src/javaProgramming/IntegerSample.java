package javaProgramming;
public class IntegerSample {

	public static void main(String[] args) {
		int[] n = {1,5,9,2,5,1};
		for (int i = 0; i < n.length; i++) {
			if (n[i] <= n[i+1]) {
				for (int j = n[i]; j <= n[i+1]; j++) {
					System.out.print( j + " ");
				}
			}
			else {
				for (int j = n[i]; j >= n[i+1]; j--) {
					System.out.print( j + " ");
				}
			}
		}

	}

}
