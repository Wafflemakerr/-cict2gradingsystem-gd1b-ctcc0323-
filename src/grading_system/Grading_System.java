package grading_system;
import java.util.Scanner;

public class Grading_System {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the limit on the number of students
        int maxNumOfStudents = 50;

        System.out.println("Computer Programming 1");
        System.out.println("Grading System");
        System.out.println("");
        
        // Input number of students
        int numOfStudents;
        while (true) {
            System.out.println("maximum " + maxNumOfStudents);
            System.out.print("Enter the number of students :");
            numOfStudents = sc.nextInt();

            // Check if the entered value is within the limit
            if (numOfStudents > 0 && numOfStudents <= maxNumOfStudents) {
                break;
            } else {
                System.out.println("Invalid number of students! Please enter a value between 1 and " + maxNumOfStudents + ".");
            }
                    
                         
        String[] names = new String[numOfStudents];
        int[] grades = new int[numOfStudents];

        
        // input grades of students
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = sc.next();

            while (true) {
                System.out.print("Enter grade for Assignment and Quiz (10%): ");
                byte assignment = sc.nextByte();
                
                 if (assignment > 100) {
                    System.out.println("Invalid grade! Grades cannot be more than 100.");
                    System.out.println();
                    continue; // Restart the loop to input grades again
                }

                System.out.print("Enter grade for attendance (10%): ");
                byte attendance = sc.nextByte();
                
                if (attendance > 100) {
                    System.out.println("Invalid grade! Grades cannot be more than 100.");
                    System.out.println();
                    continue; // Restart the loop to input grades again
                }

                System.out.print("Enter grade for Unit Test and Lab Exercises (40%): ");
                byte unittest = sc.nextByte();
                
                if (unittest > 100) {
                    System.out.println("Invalid grade! Grades cannot be more than 100.");
                    System.out.println();
                    continue; // Restart the loop to input grades again
                }

                System.out.print("Enter grade for Case Study (40%): ");
                byte casestudy = sc.nextByte();
                
                if (casestudy > 100) {
                    System.out.println("Invalid grade! Grades cannot be more than 100.");
                    System.out.println();
                    continue; // Restart the loop to input grades again
                }

                // Calculate grades
                double CSgrade = (casestudy * 0.40) + (unittest * 0.40) + (assignment * 0.10) + (attendance * 0.10);

                // input midterm examination
                System.out.print("Enter Term Examination: ");
                grades[i] = sc.nextInt();

                // Determining final grades in Midterm
                double Term = (grades[i] * 0.30) + (CSgrade * 0.70);

                System.out.println("Grade: " + Term);
                System.out.println();

                double Grade;

                if (Term >= 98) {
                    Grade = 1.0;
                } else if (Term >= 95) {
                    Grade = 1.25;
                } else if (Term >= 92) {
                    Grade = 1.5;
                } else if (Term >= 89) {
                    Grade = 1.75;
                } else if (Term >= 86) {
                    Grade = 2.0;
                } else if (Term >= 83) {
                    Grade = 2.25;
                } else if (Term >= 80) {
                    Grade = 2.5;
                } else if (Term >= 77) {
                    Grade = 2.75;
                } else if (Term >= 75) {
                    Grade = 3.0;
                } else {
                    Grade = 5.0;
                }

                // Display Grades
                System.out.println(names[i]);
                System.out.println(Grade);
                System.out.println();

                if (Grade <= 3.0) {
                    System.out.println("Passed.");
                    System.out.println();
                } else {
                    System.out.println("Failed.");
                    System.out.println();
                }
                break;
            }
        }

        // Listing names
        for (int i = 0; i < numOfStudents; i++) {
            for (int j = 0; j < numOfStudents; j++) {
                if (grades[i] > grades[j]) {
                    int temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;

                    String temp2 = names[i];
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }

        // Display Ranking
        System.out.println("\n\nRanking:");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(names[i] + ": " + grades[i]);
        }
    }
    }
}