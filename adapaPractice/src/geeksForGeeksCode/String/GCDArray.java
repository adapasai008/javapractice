package geeksForGeeksCode.String;

public class GCDArray {

	public static int findGCD(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int gcd = arr[0];
        for (int num : arr) {
            gcd = gcd(gcd, num);
        }

        return gcd;
    }
	
	public static int gcd(int a, int b) {
		while(a != 0 && b != 0) {
			if(a > b) {
				a = a%b;
			}else {
				b = b%a;
			}
		}
		if(a!=0) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
	    int[] arr = {2,4,6};
		
		int gcd = findGCD(arr);
		
		System.out.println(gcd);

	}

}
