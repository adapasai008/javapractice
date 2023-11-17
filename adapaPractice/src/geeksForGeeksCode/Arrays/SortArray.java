package geeksForGeeksCode.Arrays;

public class SortArray {

	static void sort(int[] a) {
		//Arrays.sort(arr);
        
		//with out uisng the inbuilt function
		int count0 = 0;
		int count1 = 0;
		int n = a.length;

		for (int i : a) {
			if (i == 0)
				count0++;
			else if (i == 1)
				count1++;
		}

		for (int i = 0; i < count0; i++) {
			a[i] = 0;
		}
		for (int i = count0; i < count0 + count1; i++) {
			a[i] = 1;
		}
		for (int i = count0 + count1; i < n; i++) {
			a[i] = 2;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 2, 0 };
		sort(arr);

		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
