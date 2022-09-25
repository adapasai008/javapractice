package geeksForGeeksCode;

public class Dummy1 {

	public static void main(String[] args) {

		int err[]= {3,5,4,5,3,6};
		int n = err.length;
		int k = 2;
		
		for(int i=0;i<n;i++) {
			
			int count = 0;
			
			for(int j=0;j<n;j++) {
				
				if(err[i]==err[j]) {
					
					count++;
				}
			}
			if(count == k) {
				System.out.print(err[i]+" ");
			}
			
		}
	}

}
