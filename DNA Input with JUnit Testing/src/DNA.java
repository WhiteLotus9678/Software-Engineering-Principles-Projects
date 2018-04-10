import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * @author Will Yang
 *
 */
public class DNA {
	// Stores the DNA sequence string
	private String sequence = "";
	
	/**
	 * @param sequence
	 * 		DNA sequence string
	 */
	public DNA(String sequence) {
		this.sequence = sequence;
		
		this.validate(this.sequence);
	}
	
	/**
	 * @return sequence
	 * 		DNA sequence string
	 */
	public String getSequence() {
		return this.sequence;
	}
	
	/**
	 * @param test
	 * 		User DNA sequence string input
	 * @return boolean
	 * 		true: The string is a valid DNA sequence
	 * 		false: The string is an invalid DNA sequence, set it to blank
	 */
	// @Test
	private boolean validate(String test) {
		// Regex test to determine if the string contains only a, c, g, and/or t.
		Pattern p = Pattern.compile("[acgtACGT]+");
		Matcher m = p.matcher(test);
		
		// If the sequence is empty or invalid, return false
		if(test == null || !m.matches()) {
			this.sequence = "";
			// System.out.println("Valid sequence? FALSE");
			return false;
		}
		
		// System.out.println("Valid sequence? TRUE");
		return true;
	}
	
	/**
	 * @return sequence.length()
	 * 		The length of the DNA sequence string
	 */
	public int getLength() {
		return this.sequence.length();
	}
	
	/**
	 * 
	 * @param ch
	 * 		User character input
	 * @return count
	 * 		The number of occurrences of 'ch' in the DNA sequence string
	 */
	public int occurrences(char ch) {
		// Initialize the occurrence to 0
		int count = 0;
		
		// Convert the sequence into an array of characters
		char[] charArray = getSequence().toCharArray();
		
		// If char ch is found, increment the occurrence
		for(int i = 0; i < getLength(); i++) {
			if(charArray[i] == ch) {
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * @param in
	 * 		User substring input
	 * @return boolean
	 * 		true: The substring exists in the DNA sequence string
	 * 		false: The substring does not exist in the DNA sequence string
	 */
	
	public boolean contains(String in) {
		// The user substring input is null or blank
		if(in == null || in.isEmpty()) {
			return false;
		}
		
		// The length of the sequence
		int length = getLength();
		
		// Initialize the reversed string of the sequence
		String reverse = "";
		
		char[] charArray = getSequence().toCharArray();
		
		// Check if the sequence contains the substring
		if(getSequence().contains(in)) {
			return true;
		}
		
		// Reverse the substring and append it to reverse
		for(int i = 0; i < length; i++) {
			reverse += charArray[length - 1 - i];
		}
		
		// The substring can be found going backwards through the sequence else return false
		if(reverse.contains(in)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return complement
	 * 		The complement of the DNA sequence string
	 */
	public String complement() {
		// Initialize the complement string
		String complement = "";
		
		// The length of the sequence
		int length = getLength();
		
		// Convert the sequence to an array of characters
		char[] charArray = getSequence().toCharArray();
		
		// Create an array with size equal to the length of the sequence
		char[] backArray = new char[length];
		
		// Reverse the DNA sequence and store it in an array
		for(int i = 0; i < length; i++) {
			backArray[i] += charArray[length - 1 - i];
		}
		
		// Traverse through backArray and replace nucleotides with their matching base pair
		for(int i = 0; i < length; i++) {
			if(backArray[i] == 'a' || backArray[i] == 'A') {
				complement += "t";
			}
			else if(backArray[i] == 'c' || backArray[i] == 'C') {
				complement += "g";
			}
			else if(backArray[i] == 'g' || backArray[i] == 'G') {
				complement += "c";
			}
			else if(backArray[i] == 't' || backArray[i] == 'T') {
				complement += "a";
			}
		}
		
		// Return the String representing the complement
		return complement;
	}

}
