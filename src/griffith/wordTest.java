package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class wordTest {

	 @Test
	    public void testContains() {
	         word word = new word(new char[]{'H', 'e', 'l', 'l', 'o'});
	        
	        assertTrue(word.contains('H')); // Should pass when implemented
	        assertTrue(word.contains('o')); // Should pass when implemented
	        assertFalse(word.contains('z')); // Should pass when implemented
	    }

	 @Test
	    public void testLength() {
		 word word = new word(new char[]{'H', 'e', 'l', 'l', 'o'});
		 assertEquals(5, word.length());
	    }
	 
	 @Test
	    public void testNotNull() {
	       
			word word = new word(null);

	        // Check that the internal letters array is not null
	        assertNotNull(word.getLetters());
	        
	        
	    }
	 
}
