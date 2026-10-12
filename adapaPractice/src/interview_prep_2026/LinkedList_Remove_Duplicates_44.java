package interview_prep_2026;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Remove_Duplicates_44 {

	public static void main(String[] args) {

		List<Integer> link = new LinkedList<Integer>(Arrays.asList(10, 20, 30, 10, 40, 20, 50, 30));
		List<Integer> unique = new LinkedList<Integer>();

		for (int i : link) {

			if (!unique.contains(i)) {

				unique.add(i);
			}
		}

		System.out.println(unique);
	}
}
