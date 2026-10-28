/**
 * StudentGradeCalculator
 *
 * Displays a student's information, calculates the average of three
 * assignment grades, and reports whether the student passed the course.
 */
public class StudentGradeCalculator {

    // Every Java program starts running at the main method.
    public static void main(String[] args) {

        // --- Student information (String variables hold text) ---
        String studentName = "Morgan Truitt";
        String major = "Information Systems";
        String course = "Mobile Application Development";

        // --- Assignment grades (double variables hold decimal numbers) ---
        double grade1 = 78.5;
        double grade2 = 64;
        double grade3 = 83;

        // --- Calculate the average ---
        // Add the three grades, then divide by 3 (the number of grades).
        double average = (grade1 + grade2 + grade3) / 3;

        // --- Display the student information ---
        System.out.println("Student: " + studentName);
        System.out.println("Major: " + major);
        System.out.println("Course: " + course);
        System.out.println();

        // --- Display the grades and the average ---
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        // String.format("%.2f", ...) rounds the average to 2 decimal places.
        System.out.println("Average: " + String.format("%.2f", average));

        // --- Decide pass or fail ---
        // The student passes when the average is 70 or higher.
        if (average >= 70) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
