package algo.search;

import org.junit.Test;

public class BinarySearch {
	private static int goBinarySearch(int key, int[] array, int low, int high) {
		// TODO Auto-generated method stub

		if (low <= high) {
			int mid = (low + high) / 2;
			if (key == array[mid]) {
				return mid + 1;
			} else {
				return key < mid ? goBinarySearch(key, array, low, mid) : goBinarySearch(key, array, mid, high);
			}

		}

		return -1;
	}

	@Test
	public void BinTest() {
		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

		int resul = goBinarySearch(10, a, 0, a.length);

		System.out.println(resul);
	}

}
