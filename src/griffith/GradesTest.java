package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradesTest {
	 @Test
	    public void testGradesMax() {
	        int[] grades = {85, 92, 78, 90, 88};
	        int max = Grades.gradesMax(grades);
	        assertEquals(92, max);

	        // Test case with an empty array or null
	        assertThrows(IllegalArgumentException.class, () -> Grades.gradesMax(null));
	        assertThrows(IllegalArgumentException.class, () -> Grades.gradesMax(new int[]{}));
	    }

	
	    
	 @Test
	    public void testGradesTotal() {
	        Grades grades = new Grades();
	        // Test sum of positive values
	        assertEquals(16, grades.gradesTotal(new int[]{1, 10, 5}));
	        // Test sum of negative values
	        assertEquals(-16, grades.gradesTotal(new int[]{-5, -1, -10}));
	        // Test sum with an empty array
	        assertEquals(0, grades.gradesTotal(new int[]{}));
	    }
	 
	 @Test
	    public void testGradesAverage() {
	        Grades grades = new Grades();
	        // Test average of positive values
	        assertEquals(5.33, grades.gradesAverage(new int[]{1, 10, 5}), 0.01);
	        // Test average of negative values
	        assertEquals(-5.33, grades.gradesAverage(new int[]{-5, -1, -10}), 0.01);
	        // Test average with an empty array
	        assertEquals(0, grades.gradesAverage(new int[]{}), 0.01);
	    }

	    
	 @Test
	 public void testCountFails() {
		    Grades grades = new Grades();
		    // Test counting failures below 50
		    assertEquals(3, grades.countFails(new int[]{40, 50, 60, 30, 20}, 50)); // Expect 3 instead of 2
		    // Test counting failures in negative values
		    assertEquals(3, grades.countFails(new int[]{-5, -1, -10}, 0)); // Should also be correct
		    // Test counting failures with an empty array
		    assertEquals(0, grades.countFails(new int[]{}, 50));
		}
	}