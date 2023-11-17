package geeksForGeeksCode.Arrays;

import java.util.ArrayList;

public class LeadersInArray {

	static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        
        int n = arr.length;
        int maxRight = arr[n - 1];
        
        leaders.add(maxRight); // The last element is always a leader
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }
        
        // Reverse the list to get leaders in their original order
        ArrayList<Integer> reversedLeaders = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            reversedLeaders.add(leaders.get(i));
        }
        
        return reversedLeaders;
	}
	
	public static void main(String[] args) {
		int[] arr = {16,17,4,3,5,2};
		ArrayList<Integer> result = leaders(arr);
		
		result.stream().forEach(n -> System.out.print(n+" "));
	}

}
