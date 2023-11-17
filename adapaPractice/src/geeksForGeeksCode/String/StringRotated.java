package geeksForGeeksCode.String;

public class StringRotated {

	static boolean isRotated(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 <= 2 || len2 <= 2) {
			if (str1.equals(str2)) {
				return true;
			} else {
				return false;
			}
		}
		//Right rotation
		StringBuilder temp1 = new StringBuilder();//amazon
		temp1.append(str1.substring(2, len1));//azonam
		temp1.append(str1.substring(0, 2));
		
		//Left roataion
		StringBuilder temp2 = new StringBuilder();//onamaz
		temp2.append(str1.substring(len1-2,len1));
		temp2.append(str1.substring(0,len1-2));
		
		if(temp1.toString().equals(str2)  || temp2.toString().equals(str2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "ge";
		String str2 = "ge";
		
		boolean result = isRotated(str1, str2);
		
		System.out.println(result);
				
		

	}

}
