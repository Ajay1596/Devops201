/**
 * 
 */
package devops.numbers;

/**
 * @author M1044588
 *
 */
public class NumberToWords {
	public static String[] unitsplace = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static String[] tensplace = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public String wordConverter(int n) {

		if (n == 0) {
			return "zero";
		}
		if (n < 0) {
			return "negative";
		}

		if (n < 20) {
			return unitsplace[n];
		}

		if (n < 100) {
			return tensplace[n / 10] + " " + unitsplace[n % 10];
		}

		if (n < 1000) {
			return unitsplace[n / 100] + " Hundred" + " " + wordConverter(n % 100);
		}

		if (n < 100000) {
			return wordConverter(n / 1000) + " Thousand" + " " + wordConverter(n % 1000);
		}

		if (n < 10000000) {
			return wordConverter(n / 100000) + " Lakh" + " " + wordConverter(n % 100000);
		}

		if (n < 1000000000) {
			return wordConverter(n / 10000000) + " Crore" + " " + wordConverter(n % 10000000);
		}
		if (n < 2000000000) {
			return wordConverter(n / 1000000000) + " Billion" + " " + wordConverter(n % 1000000000);
		}
		return "Invalid number";
	}

}
