package java_interview;

public class ConcatenationDemo {

	public static void main(String[] args) {
		
		//The process of combining two or more strings is called the concatenation
		//The concatenation can be done in two ways one is with the help of "+" operator
		//And the another one is using the .concat() method.
		
		String str = "Adapa";
		String str1 = "Sai "+str;
		
		System.out.println(str1);
		
		String str2 = "Adapa";
		String str3 = "Sai ".concat(str2);
		
		System.out.println(str3);

	}

}
