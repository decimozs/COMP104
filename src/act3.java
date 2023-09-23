import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class act3 {
    private static Scanner sc;

    private static String getStringInput (String message){
        sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    private static int getIntInput (String message){
        sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        String response = "";
        boolean isResponseValid;
        int sum = 0;
        double average;
        String remarks = "";
        int[] scores = new int[8];
        int length = scores.length;

        do {
            System.out.println("Hello World!");
            String name = getStringInput("Student name");
            System.out.println(name);

            for (int i = 0; i < length ; i++) {
                scores[i] = getIntInput("Enter your score: ");
                sum += scores[i];
            }

            average = (double) sum / length;


            if (average >= 70) {
                remarks = "Satisfactory";
            } else {
                remarks = "Unsatisfactory";
            }

            System.out.println("Student Name: " + name);
            System.out.println("The Test Scores are: ");
            System.out.print("           ");
            for (int i = 0; i < length ; i++) {
                System.out.print(scores[i] + "  ");
                if (i == 4) {
                    System.out.print("           ");
                }
            }
            System.out.println();

            System.out.println("\nAverage: " + df.format(average));
            System.out.println("Remarks: " + remarks);

            do {
                response = getStringInput("Please try again [Y/N]");
                isResponseValid = !response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n");

                if (isResponseValid) {
                    System.out.println("Invalid Input");
                }
            }
            while (isResponseValid);
        }

        while (!response.equalsIgnoreCase("n"));
        System.out.println("Program Terminated!");
    }
}