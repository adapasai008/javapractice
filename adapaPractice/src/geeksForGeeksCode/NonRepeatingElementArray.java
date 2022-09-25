package geeksForGeeksCode;

public class NonRepeatingElementArray {

	public static void main(String[] args) {

		int vrr[] = { 4, 5, 3, 5, 4 };

		int n = vrr.length;

		for (int i = 0; i < n; i++) {

			int j;

			for (j = 0; j < n; j++) {

				if (i != j && vrr[i] == vrr[j]) {

					break;
				}

			}
			if (j == n) {
				System.out.print(vrr[i]+" ");
			}

		}
		
	}

}
