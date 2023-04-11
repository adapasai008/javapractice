package HackerRank;

public class lexicographicalOrder {

	public static void main(String[] args) {
		String str = "welcometojava";
		int k = 3;
		String smallest = "";
		String largest = "";
		
        smallest = str.substring(0, k);
        largest = str.substring(0, k);
		
		for(int i=0;i<=str.length()-3;i++) {
			String str1 = str.substring(i,i+3);
			System.out.print(str1+ " ");
			if(str1.compareTo(smallest)<0) {//compareTo method will return the ASCII value
				smallest = str1;
			}
			if(str1.compareTo(largest)>0) {
				largest = str1;
			}
		}
		System.out.println();
		System.out.println("smallest : "+smallest+"\n"+"largest : "+largest);
 
	}

}
