import java.util.Scanner;
import java.text.DecimalFormat;

public class LabExercises {

    private static DecimalFormat df;
    private static Scanner sc = new Scanner(System.in);

    private static String calculateAverage(double avg){
        df = new DecimalFormat("0.00");
        String format = df.format(avg);

        return format;
    }

    private static String calculateGrade(double avg){
        String grade = "";
        if(avg >= 90 && avg <= 100){
            grade = "A";
        } else if (avg >= 80 && avg <= 89) {
            grade = "B";
        } else if (avg >= 70 && avg <= 79) {
            grade = "C";
        } else if (avg >= 60 && avg <= 69) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }

    private static String calculateRemarks(double avg) {
        String remarks = "";
        if(avg >= 90 && avg <= 100){
            remarks = "Outstanding";
        } else if (avg >= 80 && avg <= 89) {
            remarks = "Very Satisfactory";
        } else if (avg >= 70 && avg <= 79) {
            remarks = "Satisfactory";
        } else if (avg >= 60 && avg <= 69) {
            remarks = "Fair";
        } else {
            remarks = "Needs Improvement";
        }

        return remarks;
    }

    private static String getStudentName(String message){
        System.out.print(message);
        return sc.nextLine();
    }

    private static int getScore(String message){
        System.out.print(message);
        return sc.nextInt();
    }

    private static String getResponse(String message){
        System.out.println(message);
        return sc.next();
    }

    public static void main(String[] args) {
        String response = "";
        double avg;
        boolean isValidResponse;
        int sum = 0;
        int testScores = 0;
        int[] scores;

        do {
            System.out.println("Laboratory Execises");
            String studentName = getStudentName("Enter Student Name: ");
            testScores = getScore("\nNumber of Test Scores: ");
            scores = new int[testScores];

            for(int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt();

                sum += scores[i];
            }

            avg = sum / scores.length;

            System.out.println("Output:");
            System.out.println("Student Name: " + studentName);
            System.out.println("The Test Scores are: ");

            System.out.print("           ");
            for(int i = 0; i < scores.length; i++){
                System.out.print(scores[i] + "  ");
                if(i == 4){
                    System.out.println();
                    System.out.print("           ");
                    System.out.print(scores[i] + "  ");
                }
            }

            System.out.println("\n\nAverage : " + calculateAverage(avg));
            System.out.println("Grade   : " + calculateGrade(avg));
            System.out.println("Remakrs : " + calculateRemarks(avg));

            do {
                response = getResponse("Try Again (Y/N)?");
                isValidResponse = !response.equalsIgnoreCase("n") && !response.equalsIgnoreCase("y");

                if(isValidResponse){
                    System.out.println("Invalid Message! Please try again");
                }
            } while (isValidResponse);

        } while (!response.equalsIgnoreCase("n"));

        System.out.println("Program Terminated");
        sc.close();
    }
}