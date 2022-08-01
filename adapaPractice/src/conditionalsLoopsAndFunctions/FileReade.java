package conditionalsLoopsAndFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReade {

	public static void main(String[] args) throws FileNotFoundException {

		File inptfil = new File("D:/upgradnum.txt");

		Scanner sc = new Scanner(inptfil);

		int lenght1 = 1;
		double result = 0;
		double sum = 0;
		while (sc.hasNext()) {

			double num = sc.nextInt();

			sum = num + sum;
			if(sc.hasNextLine()==true) {
				
				lenght1++;
				
			}
			
			 result = sum/lenght1;

	
		}

		System.out.println(result);

//		while(sc.hasNextLine()==true) {
//			
//			String line = sc.nextLine();
//			System.out.println("line "+lenght1+":"+line);
//			lenght1++;
//		}

	}

}
