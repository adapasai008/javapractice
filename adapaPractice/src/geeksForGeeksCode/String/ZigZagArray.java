package geeksForGeeksCode.String;

public class ZigZagArray {

	public static void changeformate(int[] Arr) {
		boolean flag = true;
		
		for(int i=0;i<Arr.length-1;i++) {
			
			if(flag) {
				
				if(Arr[i] > Arr[i+1]) {
					swap(Arr, i, i+1);
				}
				
			}else{
				if(Arr[i] < Arr[i+1]) {
					swap(Arr, i, i+1);
				}
			}
			flag = !flag;
		}
	}
	
	public static void swap(int[] Arr,int a, int b) {
		int temp = Arr[a];
		Arr[a] = Arr[b];
		Arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int Arr[] = {4, 3, 7, 8, 6, 2, 1};//output - 3 < 7 > 4 < 8 > 2 < 6 > 1

		changeformate(Arr);
		
		for(int num : Arr) {
			System.out.print(num+" ");
		}
	}

}
