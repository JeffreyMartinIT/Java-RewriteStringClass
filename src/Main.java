/* Jeffrey Martin */

/* This programs recreates methods used in the String class, without
 * using the built in methods. The methods that are being 
 * recreated are compare, substring, toUpperCase, to Chars,
 * and valueOf.  Main runs test upon creation of the class
 * and all of the methods*/
public class Main {

	public static void main(String[] args) {
		
		/* *********************************
		 * ************VARIABLES************
		 * *********************************/
		
		UserInterface ui = new UserInterface();
		String test1 = "This is a test #1.";
		String test2 = "This is a test #2.";
		String test3 = "This is a test #.";
		String test4 = "This is a test #14.";
		
		MyString2 ms1 = new MyString2(test1);
		
		String buildResults = "\nChar | Index";
				
		boolean testTrue = true;
		boolean testFalse = false;
		
		/* *********************************
		 * ************TESTS****************
		 * *********************************/
		
		// Testing the constructor.
		ui.ConsoleOutput("Testing creating a MyString2 called ms1 using a constructor using test1 which contains: '" 
						+ test1 + "'\n results: '" +ms1.getString() + "'");
		
		// Testing compare() method.
		ui.ConsoleOutput("\nTesting compare();");
		ui.ConsoleOutput("------------------");
		ui.ConsoleOutput("Comparing ms1 which contains: '" + ms1.getString() + "'\nwith test1 which contains: '" 
						+ test1 + "'\n results: "+ ms1.compare(test1)); 
		ui.ConsoleOutput("\nComparing ms1 which contains: '" + ms1.getString() + "'\nwith test2 which contains: '" 
						+ test2 + "'\n results: "+ ms1.compare(test2)); 
		ui.ConsoleOutput("\nComparing ms1 which contains: '" + ms1.getString() + "'\nwith test3 which contains: '" 
						+ test3 + "'\n results: "+ ms1.compare(test3)); 
		ui.ConsoleOutput("\nComparing ms1 which contains: '" + ms1.getString() + "'\nwith test4 which contains: '" 
						+ test4 + "'\n results: "+ ms1.compare(test4)); 
		
		// Testing substring() method.
		ui.ConsoleOutput("\nTesting substring();");
		ui.ConsoleOutput("--------------------");
		ui.ConsoleOutput("Substring of ms1 which contains: '" + ms1.getString() + "'\nstarting at 4 \n results: '"
						+ ms1.substring(4).getString() +"'"); 
		ui.ConsoleOutput("\nSubstring of ms1 which contains: '" + ms1.getString() + "'\nstarting at -4 \n results: '"
						+ ms1.substring(-4).getString() +"'"); 
		ui.ConsoleOutput("\nSubstring of ms1 which contains: '" + ms1.getString() + "'\nstarting at 18 \n results: '"
						+ ms1.substring(18).getString() +"'"); 
		ui.ConsoleOutput("\nSubstring of ms1 which contains: '" + ms1.getString() + "'\nstarting at 40 \n results: '"
						+ ms1.substring(40).getString() +"'"); 
		
		// Testing toUpperCase() method.
		ui.ConsoleOutput("\nTesting toUpperCase();");
		ui.ConsoleOutput("----------------------");
		ui.ConsoleOutput("To upper case of ms1 which contains: '" + ms1.getString() + "'\n results: '" 
		+ (ms1.toUpperCase()).getString());
		
		// Testing toChars() method.
		char[] testChar = ms1.toChars();
		for (int index = 0; index < testChar.length; index++) {
			buildResults += "\n  " + testChar[index] + "  | " + index ;
		}
		ui.ConsoleOutput("\nTesting toChars();");
		ui.ConsoleOutput("------------------");
		ui.ConsoleOutput("To char array of msq which contains: '" + ms1.getString() + buildResults );
		
		//Testing valueOf().
		ui.ConsoleOutput("\nTesting valueOf();");
		ui.ConsoleOutput("------------------");
		ui.ConsoleOutput("Testing True \n results" + MyString2.valueOf(testTrue).getString());
		ui.ConsoleOutput("\nTesting False \n results" + MyString2.valueOf(testFalse).getString());

		
	}
}
