package util;

public class CurrencyConverter {
	
	public static double IOF = 6.0;
	
	public static double value(double price, double quantity) {
		
		return  (price * quantity) * (1+ IOF/100.0);
		
	}

}
