package geeksForGeeksCode;

public class PartyOfCouples {

	//Finding the non repeating element in the given array using "Bitwise XOR" operator.
	public static void main(String[] args) {

		int vrr[] = {4,5,6,5,4};
		int s = 0;
		
		for(int i=0;i<vrr.length;i++) {
			
			s = s^vrr[i];
		}
		System.out.println(s);
		
	}

}
