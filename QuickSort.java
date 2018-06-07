public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 87655, 9, 2, 1, 7, 3, 888 };
		int start = 0;
		int end = a.length - 1;
		qSort(a, start, end);
		print(a);
	}

	private static void qSort(int[] a, int start, int end) {
		if (start < end) {
			int pIndex = partition(a, start, end);
			qSort(a, start, pIndex - 1);
			qSort(a, pIndex + 1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pIndex = start;
		int pivot = a[end];
		for (int i = start; i < end; i++) {
			if (a[i] < pivot) {
				swap(i, pIndex, a);
				pIndex++;
			}
		}
		swap(end, pIndex, a);
		return pIndex;
	}

	private static void swap(int i, int j, int[] B) {
		int temp = 0;
		temp = B[i];
		B[i] = B[j];
		B[j] = temp;

	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.println();
	}

}
