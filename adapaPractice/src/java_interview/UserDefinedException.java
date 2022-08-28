package java_interview;

class adapaException extends Exception{
	
	public adapaException(String s) {
		
		super(s);
	}
	
}

public class UserDefinedException {

	public static void main(String[] args) {
		
		int i = 8;
		int j = 9;
		
		try {
			int k = i/j;
			
			if(k==0) {
				throw new adapaException("please change the J value");
			}
			System.out.println(k);
			
		} catch (adapaException e) {
			System.out.println(e.getMessage());
			
		}catch (Exception e) {
			System.out.println("Error");
		}
		

	}

}
