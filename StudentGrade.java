import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject: ");
        int numsubjects = sc.nextInt();

        int[] marks = new int[numsubjects];
        for (int i = 0; i < numsubjects; i++) {
            System.out.println("Enter the marks of subjects" + (i + 1) + "(out of 100):");
            marks[i] = sc.nextInt();
        }
        int totalmarks = 0;
        for (int mark : marks) {
            totalmarks += mark;
        }

        double averagePercentage = (double) totalmarks / numsubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + totalmarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
