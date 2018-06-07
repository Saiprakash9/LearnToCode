public class InsertionSort {

	public static void main(String[] args) {
		int[] A = { 4, 3, 2, 1, 5 };

		int i = 0;
		int size = A.length;
		print(A);
		while (i < size) {
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (A[j] > A[i]) {
						swap(j, i, A);
						print(A);
					}
				}
			}
			i++;
		}
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	private static void swap(int i, int j, int[] B) {
		int temp = 0;
		temp = B[i];
		B[i] = B[j];
		B[j] = temp;

	}

}
