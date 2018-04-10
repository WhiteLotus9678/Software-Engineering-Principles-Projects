import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * @author Will Yang
 * 
 */
//import org.junit.jupiter.api.Test;

public class DNAUnitTester {
	DNA dna, dna1, dna2, dna3, dna4, dna5, dna6;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Used for resources like database connections
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Return the resources used.
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dna = new DNA("");
		dna1 = new DNA("a");
		dna2 = new DNA("aardvark");
		dna3 = new DNA("~/cop1234");
		dna4 = new DNA("actga");
		dna5 = new DNA("actagtgcagcatcgatcgatgctaag");
		dna6 = null;
	}

	/**
	 * Testing object parameters with null pointers
	 */
	@Test
	public void testNull() {
		assertNull(dna6);
	}
	
	/**
	 * Testing object parameters without null pointers
	 */
	@Test
	public void testNullFail() {
		assertNotNull(dna4);
	}
	
	/**
	 * Test method for {@link DNA#getSequence()}.
	 */
	@Test
	public void testGetSequence() {
		assertEquals(dna5.getSequence(), "actagtgcagcatcgatcgatgctaag");
	}
	
	/**
	 * Test method for {@link DNA#getSequence()}.
	 */
	@Test
	public void testGetSequenceFail() {
		assertNotEquals(dna4.getSequence(), "actagtgcagcatcgatcgatgctaag");
	}
	
	/**
	 * Test method for {@link DNA#getLength()}.
	 */
	@Test
	public void testGetLength() {
		assertEquals(dna1.getLength(), 1);
	}
	
	/**
	 * Test method for {@link DNA#getLength()}.
	 */
	@Test
	public void testGetLengthFail() {
		assertNotEquals(dna4.getLength(), 1);
	}
	
	// Test Methods for occurrences(char)
	/**
	 * Test method for {@link DNA#occurrences(char)}.
	 */
	@Test
	public void testOccurrencesFirst() {
		char in = 'a';
		assertEquals(dna5.occurrences(in), 8);
	}
	
	/**
	 * Test method for {@link DNA#occurrences(char)}.
	 */
	@Test
	public void testOccurrencesLast() {
		char in = 'g';
		assertEquals(dna5.occurrences(in), 7);
	}
	
	/**
	 * Test method for {@link DNA#occurrences(char)}.
	 */
	@Test
	public void testBadOccurrence() {
		char in = 'b';
		assertEquals(dna5.occurrences(in), 0);
	}
	
	/**
	 * Test method for {@link DNA#occurrences(char)}.
	 */
	@Test
	public void testOccurrencesFail() {
		char in = 'g';
		assertNotEquals(dna4.occurrences(in), 7);
	}
	// Test Methods for occurrences(char)
	
	// Test Methods for contains(String)
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testNullCharFail() {
		String sChar = null;
		assertFalse(dna4.contains(sChar));
	}
	

	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testEmptyCharFail() {
		String sChar = "";
		assertFalse(dna4.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testSingleChar() {
		String sChar = "a";
		assertTrue(dna4.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testSingleCharFail() {
		String sChar = "a";
		assertFalse(dna2.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testDoubleChar() {
		String sChar = "ag";
		assertTrue(dna5.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testDoubleCharFail() {
		String sChar = "ag";
		assertFalse(dna1.contains(sChar));
	}
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testMultipleCharForward() {
		String sChar = "catc";
		assertTrue(dna5.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testMultipleCharForwardFail() {
		String sChar = "catc";
		assertFalse(dna4.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testMultipleCharBackward() {
		String sChar = "ctac";
		assertTrue(dna5.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testMultipleCharBackwardFail() {
		String sChar = "ctac";
		assertFalse(dna4.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testSpaceCharFail() {
		String sChar = "actga ";
		assertFalse(dna4.contains(sChar));
	}
	
	/**
	 * Test method for {@link DNA#contains(String)}.
	 */
	@Test
	public void testCapitalChar() {
		String sChar = "ACTGA ";
		assertFalse(dna4.contains(sChar));
	}
	// Test Methods for contains(String)
	
	/**
	 * Test method for {@link DNA#complement()}.
	 */
	@Test
	public void testComplement() {
		assertEquals(dna4.complement(), "tcagt");
	}
	
	/**
	 * Test method for {@link DNA#complement()}.
	 */
	@Test
	public void testComplementFail() {
		assertNotEquals(dna5.complement(), "tcagt");
	}
}
