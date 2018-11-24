package devops.numbers;

public class NumberWords {

	String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", 
			"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};

	String[] tens = {
			"",
			"",
			"Twenty",
			"Thirty",
			"Forty",
			"Fifty",
			"Sixty",
			"Seventy",
			"Eighty",
			"Ninety"
	};
	
	public String toWords(int n){
		if (n < 20){
			return units[n];
		}
		else if (n < 100){
			return (tens[n/10] + ((n % 10 != 0) ? " " : "") + units[n % 10]);
		}
		else{
			return units[n/100] + " Hundred" + ((n % 100 !=0) ? " " : "") + toWords(n % 100);
		}
	}
}
