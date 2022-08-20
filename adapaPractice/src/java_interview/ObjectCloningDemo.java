package java_interview;

class ABC implements Cloneable{//To clone we need to implement the Cloneable interface.
	
	int age;
	int size;
	
	public ABC(int age, int size) {
		super();
		this.age = age;
		this.size = size;
	}

	@Override
	public String toString() {
		return "ABC [age=" + age + ", size=" + size + "]";
	}
	
	//And we need to override the clone object.
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	
	
}

public class ObjectCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
	

		ABC obj = new ABC(25, 42);
		ABC obj1 = (ABC)obj.clone();//here we are cloning the object.
		obj1.age = 13;
		
		System.out.println(obj);
		System.out.println(obj1);

		
	}

}
