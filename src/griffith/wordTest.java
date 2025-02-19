package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class wordTest {

	 @Test
	    public void testContains() {
	        // Stub test method
	    }

	 @Test
	    public void testLength() {
	        // Stub test method
	    }
	 
	 @Test
	    public void testNotNull() {
	       
			word word = new word(null);

	        // Check that the internal letters array is not null
	        assertNotNull(word.getLetters());
	        
	        
	    }
	 
}
