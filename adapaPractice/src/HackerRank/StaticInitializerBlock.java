package HackerRank;


public class StaticInitializerBlock {

	static int B,H;
	static boolean flag = true;
	
	static {
		
		B = 2;
		H = 5;
	}
	
	public static void main(String[] args) {
	
		//Static methods access only static variables
		//Static block is executed automatically when the class is loaded
		//The code inside the static block is executed only once
		//We can print something with out creating the main method with the help of static block until JDK 1.6
		//After JDK 1,6 version it will throw an error
		//Static block can also be executed before the constructors
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
		
	}
		

	}

