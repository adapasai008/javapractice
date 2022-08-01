package conditionalsLoopsAndFunctions;

public class UserMaxVotes {

	public static void main(String[] args) {

		int[] votes = { 1, 2, 3, 5, 6, 7, 80, 9, 10, 11, 12, 13, 14, 15 };
		int userWithMostVotes = mostVotes(votes);
		System.out.println("User with the most votes is User: " + userWithMostVotes);
	}

	public static int mostVotes(int[] votesPerUser) {

		int mostVots = 0;
		
		for(int i = 0;i<votesPerUser.length;i++) {
			
			if(votesPerUser[i] > votesPerUser[mostVots]) {
				
				mostVots = i;
				//use this print statement know the values while .
				System.out.println(votesPerUser[mostVots]);
			}
			
			
		}
		return mostVots;
	}

}
