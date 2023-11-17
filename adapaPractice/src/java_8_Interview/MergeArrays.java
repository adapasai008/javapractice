package java_8_Interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {

	public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 1, 5};
        
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        
        System.out.println(Arrays.toString(c));

	}

}
