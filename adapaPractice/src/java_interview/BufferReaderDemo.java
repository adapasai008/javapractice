package java_interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws Exception {
	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter the Name");
		String name = br.readLine();
		System.out.println("My Name is "+name);
	}

//	BufferedReader is synchronous while Scanner is not. BufferedReader should be 
//	used if we are working with multiple threads.
//	
//	BufferedReader has a significantly larger buffer memory than Scanner.
//	
//	The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer),
//	but it’s more than enough.
//	
//	BufferedReader is a bit faster as compared to scanner because the scanner does the parsing
//	of input data and BufferedReader simply reads a sequence of characters.
	
	
}
