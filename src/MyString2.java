/* Jeffrey Martin */

/* This class recreates methods used in the String class, without
 * using the built in methods. The methods that are being 
 * recreated are compare, substring, toUpperCase, to Chars,
 * and valueOf. */
public class MyString2 {
	 
		/* ******************************
		 * *******BACKING FIELDS*********
		 * ******************************/

	private String string2 = "";

	/* ******************************
	 * *******PROPERTIES*************
	 * ******************************/
	
	public String getString() {
		return string2;
	}
	
	/* ******************************
	 * *******CONSTRUCTORS***********
	 * ******************************/

	public MyString2(String s) {
		string2 = s;
	}
	
	
	/* ******************************
	 * *******METHODS****************
	 * ******************************/
	
	public int compare(String s) {
		
		int returnInt = 0; //Initialize to return zero for a match.
		
		//The next two if statements make sure the strings are of equal length.
		if (s.length() < string2.length()) {
			s = padString(s, string2.length() - s.length() );
		}
		
		if (s.length() < string2.length()) {
			string2 = padString(string2, s.length() -string2.length());
		}
		
		//Loop through the string to compare
		for (int index = 0; index < s.length(); index++) {
			
			//If values are not equal find out the difference and break out of loop
			//to return that value.
			if (s.charAt(index) != string2.charAt(index)) {
				
				returnInt = string2.charAt(index) - s.charAt(index);
				index = s.length();
			}
		}
		return returnInt;
	}
	
	//Method to pad a string with blank spaces.
	private String padString(String stringToPad, int howMuch) {
		
		for (int index = 0; index < howMuch; index++) {
			stringToPad += " ";
		}
		
		return stringToPad;
	}
	
	//Method to return a new MyString2 that is a substring of the old Mystring2 starting at the 
	//index value passed in.
	public MyString2 substring(int begin) {
		
		//Check for a valid value of begin. If begin is to large set to length and the
		//string value returned will be empty.
		if (begin > string2.length()) {
			begin = string2.length();
		}
		
		//Check for a valid value of begin. If begin is negative set to zero and return the 
		//entire string value.
		if (begin < 0 ) {
			begin = 0;
		}
		
		//Initialize the string being built to be empty.
		String buildString = "";
		
		//Starting a the begin point add each char to the string being built.
		for (int index = begin; index < string2.length(); index ++) {
			buildString += string2.charAt(index);
		}
		
		//Make an instance of MyString2 based on the newly built string values and return it.
		MyString2 returnString = new MyString2(buildString);
		return returnString;
	}
	
	//Method to convert lower case letters to upper case letters.
	public MyString2 toUpperCase() {
		
		//Initialize the string being built to be empty.
		String buildString = "";
		char tempChar; //Holds char value for each index. Need for casting purposes.
		
		//Loop through every character in the string
		for (int index = 0; index < string2.length(); index++) {
			
			tempChar = string2.charAt(index); //Cast to a char
			
			//If the char is lower case make upper case
			if ( tempChar >= 'a' && tempChar <= 'z') {
				tempChar =  (char) (tempChar - 32);
			}
			
			//Add char to the string being built
			buildString+= tempChar;
		}

		//Make an instance of MyString2 based on the newly built string values and return it.
		MyString2 returnString = new MyString2(buildString);
		return returnString;
	}
		
	//Method to take the string2 value and place into a char array.
	public char[] toChars() {
		
		//Char array to be built.
		char[] buildChar = new char[string2.length()];
		
		//Loop through each character in string2 and place into the char array to be built.
		for (int index = 0; index < string2.length(); index++) {
			buildChar[index] = string2.charAt(index);
		}
		
		return buildChar;
	}
	
	//Take the boolean value and return a string of True or False.
	public static MyString2 valueOf(boolean b) {
		
		//Initialize the boolValue string to false.
		String boolValue = "False";
		
		//Change the boolValue string to true as value is true.
		if (b) {
			boolValue = "True";
		}
		
		//Create an instance of MyString2 based on the newly built boolValue and return it.
		MyString2 returnString = new MyString2(boolValue);
		return returnString;
	}
	
}
