package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	public static void main(String[] args) {
		
		int currency = 1900;
		
		Locale IND = new Locale("en","IN");
		
		NumberFormat IN = NumberFormat.getCurrencyInstance(IND);
		NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("IN: "+IN.format(currency));
		System.out.println("US: "+US.format(currency));

	}

}
