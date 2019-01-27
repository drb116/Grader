import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class RecursionTesting {
	
	RecursionClasswork testObj;
	boolean graded = true;
	
	@Before
	public void setUp() throws Exception {
		Scanner scan = new Scanner(new File("classname.txt"));
		String className = scan.nextLine();
		testObj = (RecursionClasswork) Class.forName(className).newInstance();

	}
	
	@Test
	public void factorial() {
		System.out.print("Testing factorial(5): ");
		assertEquals(120,testObj.factorial(5));
		if (graded) assertEquals(720,testObj.factorial(6));
	}
	
	@Test
	public void sumDigits() {
		System.out.print("Testing sumDigits(5376): ");
		assertEquals(21,testObj.sumDigits(5376));
		if (graded) assertEquals(22,testObj.sumDigits(8923));
	}
	
	@Test
	public void fibNumber() {
		System.out.print("Testing fibNumber(10): ");
		assertEquals(55,testObj.fibNumber(10));
		if (graded) assertEquals(3524578,testObj.fibNumber(33));
	}
	
	@Test
	public void reverse() {
		System.out.print("Testing reverse(\"computer science\"): ");
		assertEquals("ecneics retupmoc",testObj.reverse("computer science"));
		if (graded) assertEquals("dnommah",testObj.reverse("hammond"));
	}
	
	@Test
	public void palindrome() {
		System.out.print("Testing isPalindrome(\"race car\"): ");
		assertEquals(true,testObj.isPalindrome("race car"));
		if (graded) 
			assertEquals(true,testObj.isPalindrome("Anne I vote more cars race Rome to Vienna"));
		if (graded) 
			assertEquals(false,testObj.isPalindrome("not a palindrome"));
	}
	
	@Test
	public void money() {
		System.out.print("Testing money(\"hello\"): ");
		assertEquals("h$e$l$l$o",testObj.money("hello"));
		if (graded) assertEquals("h$i",testObj.money("hi"));
		if (graded) assertEquals("h",testObj.money("h"));
		if (graded) assertEquals("",testObj.money(""));
	}

}
