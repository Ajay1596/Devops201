package devops.numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public final class NumberWordsApplication {

	public static void main(String[] args) {
		int n= -1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		NumberToWords obj = new NumberToWords();
	
		while(true)
		{
		
			System.out.println("Enter a number to wordConverter into word format");
			try {
			
			n = Integer.parseInt(in.readLine());
			if(obj.wordConverter(n)=="zero") {
				System.out.println("zero");
				break;
			}
			else if(obj.wordConverter(n)=="negative") {
				System.out.println("Negative not allowed");
				continue;
			}
			}
			catch(InputMismatchException a)
			{
				System.out.println("Invalid number");
				continue;
			}
			catch(Exception e)
			{
				System.out.println("Invalid number");
				continue;
			}
			System.out.println(obj.wordConverter(n));
			
			
		}

	}

}
