package geeksForGeeksCode.String;

public class ReverseWords {

	static String reverse(String str) {
		String[] ch = str.split("\\.");
		StringBuilder result = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {

			if (i == 0) {
				result.append(ch[i]);
				break;
			}

			result.append(ch[i] + ".");
		}
		return result.toString();

	}

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		String rev = reverse(str);

		System.out.println(rev);

	}

}
