import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        String[] studentNames = new String[numberOfStudents];
        int[] studentScores = new int[numberOfStudents];

        for (int count = 0; count < numberOfStudents; count++) {
            System.out.print("Enter student " + (count + 1) + "'s name: ");
            studentNames[count] = scanner.next();
            System.out.print("Enter " + studentNames[count] + "'s score: ");
            studentScores[count] = scanner.nextInt();
        }

        int minScoreIndex = 0;
        int secondMinScoreIndex = 0;
        int minScore = studentScores[0];
        int secondMinScore = studentScores[0];

        for (int count = 1; count < numberOfStudents; count++) {
            if (studentScores[count] < minScore) {
                secondMinScore = minScore;
                secondMinScoreIndex = minScoreIndex;
                minScore = studentScores[count];
                minScoreIndex = count;
            } else if (studentScores[count] < secondMinScore) {
                secondMinScore = studentScores[count];
                secondMinScoreIndex = count;
            }
        }

        System.out.println("Student with the lowest score: " + studentNames[minScoreIndex] + " (" + minScore + ")");
        System.out.println("Student with the second-lowest score: " + studentNames[secondMinScoreIndex] + " (" + secondMinScore + ")");
    }
}
