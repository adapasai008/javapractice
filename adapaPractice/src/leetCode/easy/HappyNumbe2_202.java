package leetCode.easy;

public class HappyNumbe2_202 {

	//Pattern: Fast and Slow pointer
	public static boolean isHappy(int num) {

		int slow = num;
		int fast = num;

		do {
			slow = getNext(slow);// Here it will take one step at a time 1+1 = 2 
			fast = getNext(getNext(fast));// Here it will take two steps 1+1+1 = 3
		} while (slow != fast && fast != 1);//if the slow and fast pointer both are equals or fast == 1 loop will get terminated. 

		return fast == 1;
	}

	public static int getNext(int num) {
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int num = 19;

		boolean result = isHappy(num);

		System.out.println(result);

	}

}
/*Here, I have used the two-pointer approach, with a slow pointer and a fast pointer. If it's not a happy number, 
 it will get stuck in a repeated loop. Eventually, both the fast and slow pointers will meet, and then the loop will terminate.
*The time compelxity is "O(log n)" because it will loop untill the conditions are met. 
*Space complexity is "O(1)" because it's just using the constant space for the slow and fast pointers.
 */