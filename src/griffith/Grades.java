package griffith;

public class Grades {
	 // Method to find the maximum grade
    public static int gradesMax(int[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grades array is empty or null");
        }

        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // Method to calculate the total of the grades
    public int gradesTotal(int[] grades) {
        if (grades == null) {
            throw new IllegalArgumentException("Grades array is null");
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    // Method to calculate the average of the grades
    public double gradesAverage(int[] grades) {
        if (grades == null || grades.length == 0) {
            return 0.0; // Return 0 for an empty or null array
        }

        int total = gradesTotal(grades); // You can reuse gradesTotal method here
        return total / (double) grades.length;
    }

    // Method to count how many grades are below the minimum grade
    public int countFails(int[] grades, int minGrade) {
        if (grades == null) {
            throw new IllegalArgumentException("Grades array is null");
        }

        int count = 0;
        for (int grade : grades) {
            if (grade < minGrade) {
                count++;
            }
        }
        return count;
    }
}