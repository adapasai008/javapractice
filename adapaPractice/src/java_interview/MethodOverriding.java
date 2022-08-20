package java_interview;

class Bank{
	
	int getIntrestRate(){return 0;}
	
}
class SBI extends Bank{
	//Here it's overriding the Bank method.
	int getIntrestRate(){return 7;}
}
class HDFC extends Bank{
	
	int getIntrestRate(){return 8;}
}
class ICICI extends Bank{
	
	int getIntrestRate(){return 3;}
}



public class MethodOverriding {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		ICICI icici = new ICICI();
		
		System.out.println(sbi.getIntrestRate());
		System.out.println(hdfc.getIntrestRate());
		System.out.println(icici.getIntrestRate());

	}

}
