import java.util.Scanner;

/**
 * 
 * @author Student
 *
 */
public class DNADriver {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a DNA sequence: ");
		String userDNA = scan.nextLine();
		
		String testDNA = "actagtgcagcatcgatcgatgcta";
		
		// Initialize DNA object
		DNA dnaTest = new DNA(userDNA);
		
		System.out.println("Complement: " + dnaTest.complement());
		
		boolean run = true;
		
		do {
			System.out.println("What would you like to do?");
			
			System.out.println("Enter a substring to verify: ");
			String subString = scan.nextLine();
			
			String testSubString = "tag";
			
			System.out.println("Enter the nucleotide you wish to count for: ");
			char checkChar = scan.nextLine().charAt(0);
			
			char testChar = 'a';
			
			System.out.println("Occurences of \"" + checkChar + "\" : " + dnaTest.occurrences(checkChar));
			
			System.out.println("Contains \"" + subString + "\" ? " + dnaTest.contains(subString));
			
			System.out.println("Would you like to look for more information? (Y/N)");
			char check = scan.nextLine().charAt(0);
			
			if(check == 'N' || check == 'n') {
				run = false;
			}

		} while (run == true);
		
		scan.close();
	}
}
