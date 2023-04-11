package java_interview_code;

public class DummyTest {

	public static void main(String[] args) {

		//add the first element and last element in the given array.
		
		int[] arr = {2,4,3,5,3,18};
		
		int first = arr[0];
		int last = arr[arr.length-1];
		
		int sum = first+last;
		
		System.out.println(sum);
		
	}

}
