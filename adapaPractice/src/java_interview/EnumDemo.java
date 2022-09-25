package java_interview;


public class EnumDemo {

	//Then Enum in Java is a data type which contains a fixed set of constants.
	//example weeks, directions, days, months etc.
	
	//Enum improves type safety 
	//Enum can be used in switch 
	//Enum can be traversed 
	//Enum can have fields, constructors and methods
	//Enum may implement many interfaces but cannot extend any class because it internally extends Enum class.
	public enum seasons{WINTER,SUMMER,SPRING,FALL};
	
	public static void main(String[] args) {
		
	for(seasons s : seasons.values()) {
		
		System.out.println(s);
	}

	}

}
