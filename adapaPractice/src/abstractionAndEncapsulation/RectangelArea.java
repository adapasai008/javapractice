package abstractionAndEncapsulation;

class Rectangle{
	
	float length;
	float breadth;
	
	public void area() {
		
		float area = length*breadth;
		
		System.out.println(area);
		
	}
	
}

public class RectangelArea {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle();
		R1.length=7.33f;
		R1.breadth=4.22f;
		R1.area();
		
				

	}

}
