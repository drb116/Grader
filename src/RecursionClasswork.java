import java.io.IOException;
import java.lang.invoke.MethodHandles;

public class RecursionClasswork {

	/**
	 * 
	 * @param a Positive integer
	 * @return Factorial of that number
	 * 
	 *  Example: factorial(4) -> 24 Remember factorial 4 = 4*3*2*1
	 */
	public int factorial(int a) {

		return 0;
	}

	/**
	 * 
	 * @param a Non-negative integer
	 * @return Sum of the digits.
	 * 
	 * Example: sumDigitst(123) -> 6
	 */
	public int sumDigits(int a) {

		return 0;
	}

	/**
	 * 
	 * @param Positive integer 
	 * @return That number in the sequence
	 * 
	 * Fibonaci sequence: 1,1,2,3,5,8,13,21,34,...
	 * fibNumber(7) -> 13
	 */
	public int fibNumber(int a) {
		
		return 0;
	}
	
	/**
	 * 
	 * @param s String that has length > 0
	 * @return String with letters reversed
	 * 
	 * Example: reverse("hello") -> olleh
	 */
	public String reverse(String s) {
		
		return "s";
	}

	/**
	 * 
	 * @param phrase String that could be any length and can contain spaces
	 * @return true if the phrase is a palindrome
	 * 
	 * note: spaces should be ignored for the palindrome, ie. race car is a palindrome.
	 *       The first line of code will remove all spaces and cast to lower case for you.
	 */
	public boolean isPalindrome(String phrase) {
		//removes spaces and cast to lower case
		phrase = phrase.toLowerCase().replaceAll("\\s+","");
		
		return false;
	}

	/**
	 * 
	 * @param word String of any length
	 * @return Word with $ between each letter
	 * 
	 * Example: hello -> h$e$l$l$o
	 * 			hi -> h$i
	 * 			h -> h
	 * 			"" -> ""
	 */
	public String money(String word) {
		 
		return "$";
	}

}
