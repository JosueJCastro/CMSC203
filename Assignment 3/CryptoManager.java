/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (Each class there are two sets of encryption and decryption)
 * Due: 10/19/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Josue Castro
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager 
{
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
		
	public static boolean isStringInBounds (String plainText) 
	{
		// pizza is what im returning to see if the String is in bound
		boolean inBound = true;
		for(int i = 0; i < plainText.length();i++)
		{
		 
			if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)
			{
				inBound = false;
				//If this break is removed then it fails the test
				break;
			}
			else 
			{
				inBound = true;
			}
		}
			return inBound;
	 
		//throw new RuntimeException("method not implemented");
	}
	
	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) 
	{
		String output = "";
		// Cheese is set if String is in range
		boolean cheese = isStringInBounds(plainText);
		char place;
		int placeTwo;
		if(cheese == true)
		{
			if(key > 64)
			{
				for(int i = 0; i < plainText.length(); i++)
				{
					place = plainText.charAt(i);
					placeTwo = key + place;
					while(placeTwo > UPPER_RANGE)
					{
						placeTwo -= RANGE;
					}
					output = output + String.valueOf((char)(placeTwo));
				}
		    
					
			}
			else if(key >= 0 && key <= 64)
			{
				for(int i = 0; i < plainText.length(); i++)
				{
					place = plainText.charAt(i);
					placeTwo = place + key;
					output = output + String.valueOf((char)(placeTwo));
				}
		
			}
			
			

		}
		else 
		{
			output = "The selected string is not in bounds, Try again.";
		}
		
		 
		return output;
		//throw new RuntimeException("method not implemented");
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) 
	{
		String encrypted = ""; 
		int belChar;
		boolean inBoundPlainText = isStringInBounds(plainText);
		if (inBoundPlainText == true) 
		{
			// I will be using i and j which can look unorthodox
			// I and J will iterate and if it is equal to the length it adds plainText and bellasoStr togethr
			for (int i=0, j=0; i < plainText.length(); i++, j++) 
			{
				//modulus can also be used but I'm going to used this if statement 
				// This code checks the length and it resets back when {j = 0}
				if (j == bellasoStr.length()) {	j = 0; } 
				belChar = plainText.charAt(i) + bellasoStr.charAt(j); 

				while (belChar > UPPER_RANGE) 
				{
					belChar -= RANGE;
				}
				//Type casted to a char because original char is an int
				encrypted += (char)(belChar); 
			}
		}
		return encrypted; // Return encrypted text
		
		//throw new RuntimeException("method not implemented");
	}
    
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) 
	{
		String decrypted = "";
		// Don't decrypt if encryption fails
		// It uses the other function to see if the orginal message was even encrypted and is valid 
		if (encryptedText.equals("The selected string is not in bounds, Try again.")) 
		{
			return "";
		}

		 
			//Using enhanced for loop
		for (char c : encryptedText.toCharArray()) 
		{
			int decryption = c - key; // Decrypt each character by subtracting ASCII code by a key number
			while (decryption < LOWER_RANGE) 
			{
						decryption += RANGE;
			}
					decrypted += (char)(decryption); 		
		}
				return decrypted; // Return decrypted text
		

	    
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		int belChar;
		String decrypted = "";
		if (encryptedText.equals("The selected string is not in bounds, Try again.")) 
		{
					return "";
		}	 
		// Similar idea to encrypting but instead of adding this time we are taking away
		for (int i=0, j=0; i < encryptedText.length(); i++, j++) 
		{
			//modulus can also be used but I'm going to used this if statement 
			// This code checks the length and it resets back when {j = 0}
				if (j == bellasoStr.length()) {	j = 0; }
					 belChar = encryptedText.charAt(i) - bellasoStr.charAt(j); 
					while (belChar < LOWER_RANGE) {
						belChar += RANGE; 
					}
					decrypted += (char)(belChar); 
		}
		
		return decrypted; 
			
		//throw new RuntimeException("method not implemented");
	}
}
