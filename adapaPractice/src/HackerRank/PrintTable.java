package HackerRank;

public class PrintTable {

	public static void main(String[] args) {

       //This program will print the 2 table
		
		int n = 2;
		
		for(int i=1;i<=10;i++) {
			
			//data output format 
			//At first we will give the data format syntax inside " " and it will give out according to that.
			//And there are predefined format methods in java look into it.
			System.out.printf("%d + %d = %02d %n",n ,i, n*i);
		}

	}

}
