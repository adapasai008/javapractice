package java_interview;

public class EqualsOperatorAndequalsMethod {

	public static void main(String[] args) {
		
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");//here it is the new object and it contains the new reference or address in heap.
  
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

        /*1. "==" is a operator and .equals() is a method both used to compare the two objects in java.
          2.But == operator compares reference or memory location of the object in a heap.
          3. .equals() method will compare the values of the object.
        */
        
        
	}

}
