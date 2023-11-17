package java_interview_code;

public class CharRepeatCount {

	public static void main(String[] args) {
		char[] ch = { 'a', 'f', 'a', 'f', 'a', 't' };//out put a=3, f=2

		for (int i = 0; i <= ch.length-1; i++) {
			
			if(ch[i] == 0) {// If the value in this position is 0 it will not go to the next for loop.
				continue;
			}
			
             int count = 1;
             
             for(int j=i+1;j<=ch.length-1;j++) {
            	 if(ch[i] == ch[j]) {
            		 count++;
            		 ch[j] = 0;//Here it's make the repeating values into 0
            	 }
             }
             if(count > 1) {
            	 System.out.println(ch[i]+" = "+count);
             }
		}
	}

}
