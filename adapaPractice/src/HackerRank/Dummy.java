package HackerRank;

public class Dummy {
	
	public static void sortNums(int[] nums1, int m, int[] nums2, int n) {
		int left = m-1;
		int right = n-1;
		int len = m+n-1;
		
		while(right >=0) {
			if(nums1[left] >= nums2[right]) {
				nums1[len] = nums1[left];
				left--;
				len--;
			}else {
				nums1[len] = nums2[right];
				right--;
				len--;
			}
		}
		
		
	}

	public static void main(String[] args) {

		int[] nums1 = {1};
		int m = 1;
		int[] nums2 = {};
		int n = 0;
		
		sortNums(nums1, m, nums2, n);
		
		for(int i : nums1) {
			System.out.print(i+" ");
		}
		
		
		
	}

}