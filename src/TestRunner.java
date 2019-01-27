import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;


public class TestRunner {

	public static void main(String[] args) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter("classname.txt"));
	    writer.write(args[0]);
	    writer.close();
	   
		Class testClass = RecursionTesting.class;
		ArrayList<String> tests = new ArrayList<String>();
		
		tests.add("factorial");
		tests.add("sumDigits");
		tests.add("fibNumber");
		tests.add("reverse");
		tests.add("palindrome");
		tests.add("money");
		
		System.out.println("**********************");
		System.out.println("\t" + args[0]);
		System.out.println("**********************");
		int passCount = 0;
		for (String test : tests) {
			String resultMessage = "Fail";
			Request request = Request.method(testClass, test);
			Result result = new JUnitCore().run(request);
			
			if (result.wasSuccessful()) {
				resultMessage = "Pass";
				passCount ++;
			}
			
			System.out.println(resultMessage);
		}
		
		System.out.println();
		System.out.println("** Summary for " +args[0] + " **");
		System.out.println(passCount + " out of " + tests.size() + " passed.");
		System.out.println();
		
		
		
	}

}
