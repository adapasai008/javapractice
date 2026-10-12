package interview_prep_2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_To_List_38 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Sai");
		map.put(102, "Ravi");
		map.put(103, "Priya");
		map.put(104, "Arun");
		map.put(105, "Keerthi");

		List<String> list = new ArrayList<String>();

		for (Map.Entry<Integer, String> word : map.entrySet()) {

			list.add(word.getValue());

		}

		System.out.println(list);

		/* Java 8 code solution */

		List<String> list8 = map.entrySet().stream().map(w -> w.getValue()).toList(); // one way of implementing it.
		List<String> list8_1 = map.values().stream().toList(); // another way of implementing it.

		System.out.println(list8);
		System.out.println(list8_1);

		/* Simpple approach using map.values() */
		List<String> simple = new ArrayList<String>(map.values());
		System.out.println(simple);
	}

}
