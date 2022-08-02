package methodsPracitce;

class Soldier{
	
	String name;
	String gunName;
	
	public void gunFired(){
		System.out.println("Soldier: "+name+" fired: "+gunName);	
	}
	
	
}
public class MethodGuns {


	public static void main(String[] args) {
		Soldier sd = new Soldier();
		sd.name="Adapa Sai";
		sd.gunName="AK47";
		
		sd.gunFired();
		
		Soldier sd1 = new Soldier();
		sd1.name="Delata";
		sd1.gunName="KAR98";
		
		sd1.gunFired();

	}

}
