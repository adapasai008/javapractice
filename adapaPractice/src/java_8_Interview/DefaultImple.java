package java_8_Interview;


interface demo{
	String name(String str);
	
	default int count(int i) {
		return i*i;
	}
}
class test implements demo{

	@Override
	public String name(String str) {
		return "Hello " + str;
	}
	
}

public class DefaultImple {
	
	public static void main(String[] args) {
		test d1 = new test();
		String name = d1.name("Adapa Sai");
		
		
		int square = d1.count(4);
		
		System.out.println(name+" "+"Count "+square);
	}

}
