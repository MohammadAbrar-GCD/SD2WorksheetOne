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

    //Checks if the given character exists in the letters array.
    public boolean contains(char symbol) {
    	for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }
    

    
    public int length() {
    	 return letters.length; // Returns the length
    }

    // Method to return the letters array
    public char[] getLetters() {
        return letters;
    }
}

