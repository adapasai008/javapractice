package java_8_Interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraysNoDuplicates {

	public static void main(String[] args) {
        int[] a = new int[] {4, 2, 5, 1};
        
        int[] b = new int[] {6, 3, 1, 5};
        
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        
        System.out.println(Arrays.toString(c));

	}

}
