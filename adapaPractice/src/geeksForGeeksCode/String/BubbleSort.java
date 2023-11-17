package geeksForGeeksCode.String;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {2,3,5,1,4};//sort the array using the bubbl sort algorathim;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}
		for(int n : arr) {
			System.out.print(n+" ");
		}
 
	}

}



