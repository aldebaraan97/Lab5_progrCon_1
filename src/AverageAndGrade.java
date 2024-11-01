import java.util.Scanner;

public class AverageAndGrade {
    public static void main(String[] args) {
        int flag = 1;
        double average = 0;
        double score;
        String determineGrade;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Program to calculate the average of five test scores.");
        while (flag <= 5) {
            System.out.println("Enter the score of test " + flag);
            score = keyboard.nextDouble();
            System.out.println("The grade for test " + flag + " is " +
                    determineGrade(score));
            average += score;
            flag++;
        }

        average = calcAverage(average);
        determineGrade = determineGrade(average);
        System.out.println("Your grade is " + determineGrade);
    }

    public static double calcAverage(double score) {
        return score / 5;
    }

    public static String determineGrade(double average) {
        String grade = "";
        if (average >= 0 && average <= 39)
            grade = "F";
        else if (average >= 40 && average <= 49)
            grade = "E";
        else if (average >= 50 && average <= 54)
            grade = "D";
        else if (average >= 55 && average <= 59)
            grade = "D+";
        else if (average >= 60 && average <= 64)
            grade = "C";
        else if (average >= 65 && average <= 69)
            grade = "C+";
        else if (average >= 70 && average <= 74)
            grade = "B";
        else if (average >= 75 && average <= 79)
            grade = "B+";
        else if (average >= 80 && average <= 84)
            grade = "A-";
        else if (average >= 85 && average <= 89)
            grade = "A";
        else if (average >= 90 && average <= 100)
            grade = "A+";

        return grade;
    }
}
