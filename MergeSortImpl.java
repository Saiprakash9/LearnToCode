public class MergeSortImpl {

	public static void main(String[] args) {

		int[] a = { 4, 6, 3, 1, 7, 2, 8 };
		mergeSort(a);
		print(a);
	}

	private static void mergeSort(int[] a) {
		int size = a.length;
		if (size < 2) {
			return;
		}
		int mid = size / 2;
		int lASize = mid;
		int rASize = size - mid;
		int i = 0;
		int[] leftArray = new int[lASize];
		int[] rightArray = new int[rASize];

		while (i < lASize) {
			leftArray[i] = a[i];
			i++;
		}
		print(leftArray);
		for (int j = mid; j < size; j++) {
			rightArray[j - mid] = a[j];
		}
		print(rightArray);
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, a);
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] a) {
		int l = 0, r = 0, k = 0;
		int lSize = leftArray.length;
		int rSize = rightArray.length;
		while (l < lSize && r < rSize) {
			if (leftArray[l] < rightArray[r]) {
				a[k] = leftArray[l];
				l++;
			} else {
				a[k] = rightArray[r];
				r++;
			}
			k++;
		}
		while (l < lSize) {
			a[k] = leftArray[l];
			l++;
			k++;
		}
		while (r < rSize) {
			a[k] = rightArray[r];
			r++;
			k++;
		}
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
