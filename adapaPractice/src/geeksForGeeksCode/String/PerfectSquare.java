package geeksForGeeksCode.String;

class CountSquares{
	
    static int countSquares(int a, int b)
    {
        int cnt = 0;
 
        for (int i = a; i <= b; i++)
 
            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    cnt++;
        return cnt;
    }
	
}

public class PerfectSquare {

	public static void main(String[] args) {
		int a = 9;
		int b = 25;
		
		int square = CountSquares.countSquares(a, b);
		
		System.out.println(square);

	}

}
