package java_interview;

public class StringBufferDemo {

	//String class is immutable class
	//StringBuffer and StringBuilder are mutable
	//StringBuffer is synchronized i.e it's thread safe. It means two threads can't call this method simultaneously.
	//StringBulider is non-synchronized i.e it's not thread safe.
	public static void main(String[] args) {
	
		StringBuffer bfr = new StringBuffer("I am from ");
		bfr.append("Hyderabad");
		bfr.delete(10, 15);
		
		System.out.println(bfr);
		

	}

}
