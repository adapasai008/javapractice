package starNumPatterns;


public class MarioSteps {

	public static void main(String[] args) {
	
		int steps = 4;
		
		for(int i=0;i<steps;i++) {
			
			for(int j=steps-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	}

}
