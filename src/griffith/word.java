package griffith;

public class word {

	private char[] letters;

    // Constructor
	 public word(char[] letters) {
	        if (letters == null) {
	            this.letters = new char[0]; // Assign an empty array instead of null
	        } else {
	            this.letters = letters;
	        }
	    }

    // Stub method to check if the word contains a character
    public boolean contains(char symbol) {
        return false; // Stub implementation
    }

    // Stub method to return the length of the word
    public int length() {
        return 0; // Stub implementation
    }

    // Method to return the letters array
    public char[] getLetters() {
        return letters;
    }
}

