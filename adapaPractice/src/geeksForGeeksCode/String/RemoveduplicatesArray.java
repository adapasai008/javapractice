package geeksForGeeksCode.String;

import java.util.Arrays;

class Duplicates{
	static int removeDuplicates(int[] arr,int ln) {
		if(ln == 0 || ln == 1) {
			return ln;
		}
		int j = 0;
		
		for(int i=0;i<ln-1;i++) {
		    if(arr[i] != arr[i+1]) {
		    	arr[j] = arr[i];
		    	j++;
		    }	
		}
		
		arr[j] = arr[ln-1];
		j++;
		
		return j;
	}
}

public class RemoveduplicatesArray {

	public static void main(String[] args) {
		int[] arr = {3,5,2,1,2};
		Arrays.sort(arr);
		int ln = arr.length;
		int result = Duplicates.removeDuplicates(arr,ln);
	    
		for(int i=0;i<result;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
