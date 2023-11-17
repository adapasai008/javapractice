package geeksForGeeksCode.String;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String a, String b) {
		boolean result = false;

		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();

		if (ch1.length != ch2.length) {
			return result;
		}

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				result = false;
				break;
			}
			result = true;
		}

		return result;
	}
	//This is the best solution to find the anagaram
    public static boolean isAnagram1(String a,String b)
    {
        
        boolean result = false;

		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();

        if(ch1.length != ch2.length) {
			return result;
		}
        
		Arrays.sort(ch1);
		Arrays.sort(ch2);

        //Here converting the char array into the string and comparing those two strings.     
        String str1 = new String(ch1); 
        String str2 = new String(ch2);
      
      if(str1.equals(str2)){
          result = true;
      }
		return result;
    }
	public static void main(String[] args) {
		String a = "adapa";
		String b = "daapa";

		boolean result = isAnagram(a, b);
		boolean result1 = isAnagram1(a, b);
				

		System.out.println(result);
		System.out.println("Another solution ans : "+result1);

	}

}
