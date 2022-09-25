package java_interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*A variable that is initialized by it's default value during the de-serialization is know as the transient 
variable.
*/
class Save1 implements Serializable{
	
	int i;
	transient int y;//transient variable.
	
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Save1 obj =  new Save1();
		obj.i = 25;
		obj.y = 100;//transient variable value while serialization
		
		System.out.println("values of obj while serialization = "+obj.i+" "+obj.y);
		
		//To save the object in the text format.
		File f = new File("save.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(obj);
		
		//To retrieve the object 
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fin);
		Save1 obj1 = (Save1) ois.readObject();
		
		System.out.println("Values of obj1 while de-serialization = "+obj1.i+" "+obj1.y);//transient variable value will be default value.
		ous.close();
		ois.close();

	}

}
