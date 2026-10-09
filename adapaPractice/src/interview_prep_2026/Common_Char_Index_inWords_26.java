package interview_prep_2026;

public class Common_Char_Index_inWords_26 {

	public static void main(String[] args) {

		String[] strs = { "flower", "carflow", "abcfdel" };

		String word = strs[0];

		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			int index0 = i;

			int index1 = strs[1].indexOf(ch);
			int index2 = strs[2].indexOf(ch);

			if (index1 != -1 && index2 != -1) {
				System.out.println("Common character = " + ch + " : " + index0 + ", " + index1 + ", " + index2);
			}

		}

	}

}
